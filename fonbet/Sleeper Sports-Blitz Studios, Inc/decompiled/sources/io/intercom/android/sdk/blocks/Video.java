package io.intercom.android.sdk.blocks;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.ImageView;
import com.intercom.twig.Twig;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.api.Api;
import io.intercom.android.sdk.blocks.Video;
import io.intercom.android.sdk.blocks.lib.VideoProvider;
import io.intercom.android.sdk.blocks.lib.interfaces.VideoBlock;
import io.intercom.android.sdk.blocks.lib.models.BlockMetadata;
import io.intercom.android.sdk.blocks.views.VideoPreviewView;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.utilities.BlockUtils;
import io.intercom.android.sdk.utilities.IntentUtils;
import java.io.IOException;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes9.dex */
class Video implements VideoBlock {
    private final Api api;
    private final Provider<AppConfig> appConfigProvider;
    private final StyleType style;
    private final Twig twig = LumberMill.getLogger();

    Video(StyleType styleType, Api api, Provider<AppConfig> provider) {
        this.style = styleType;
        this.api = api;
        this.appConfigProvider = provider;
    }

    @Override // io.intercom.android.sdk.blocks.lib.interfaces.VideoBlock
    public View addVideo(String str, VideoProvider videoProvider, String str2, BlockMetadata blockMetadata, ViewGroup viewGroup) {
        WebView webView = new WebView(viewGroup.getContext());
        BlockUtils.createLayoutParams(webView, -1, 480);
        webView.setWebChromeClient(new WebChromeClient());
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl(VideoUrlUtilKt.getEmbedUrl(videoProvider, str2));
        return webView;
    }

    /* renamed from: io.intercom.android.sdk.blocks.Video$5, reason: invalid class name */
    static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] $SwitchMap$io$intercom$android$sdk$blocks$lib$VideoProvider;

        static {
            int[] iArr = new int[VideoProvider.values().length];
            $SwitchMap$io$intercom$android$sdk$blocks$lib$VideoProvider = iArr;
            try {
                iArr[VideoProvider.WISTIA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$intercom$android$sdk$blocks$lib$VideoProvider[VideoProvider.YOUTUBE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$intercom$android$sdk$blocks$lib$VideoProvider[VideoProvider.VIMEO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$io$intercom$android$sdk$blocks$lib$VideoProvider[VideoProvider.LOOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    void fetchThumbnail(VideoProvider videoProvider, final String str, final VideoPreviewView videoPreviewView) {
        final ImageView thumbnailImageView = videoPreviewView.getThumbnailImageView();
        int i = AnonymousClass5.$SwitchMap$io$intercom$android$sdk$blocks$lib$VideoProvider[videoProvider.ordinal()];
        if (i == 1) {
            this.api.getVideo("https://fast.wistia.com/oembed?url=https://home.wistia.com/medias/" + str, new Callback() { // from class: io.intercom.android.sdk.blocks.Video.1
                @Override // okhttp3.Callback
                public void onFailure(Call call, IOException iOException) {
                    videoPreviewView.showFailedImage();
                }

                @Override // okhttp3.Callback
                public void onResponse(Call call, Response response) {
                    if (response.isSuccessful()) {
                        final String str2 = "https://fast.wistia.net/embed/iframe/" + str;
                        final String thumbnailUrlFromOembedResponse = Video.this.getThumbnailUrlFromOembedResponse(response);
                        thumbnailImageView.post(new Runnable() { // from class: io.intercom.android.sdk.blocks.Video.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                Video.this.createThumbnail(videoPreviewView, str2, thumbnailUrlFromOembedResponse);
                            }
                        });
                        return;
                    }
                    videoPreviewView.showFailedImage();
                }
            });
            return;
        }
        if (i == 2) {
            createThumbnail(videoPreviewView, "https://www.youtube.com/watch?v=" + str, "https://img.youtube.com/vi/" + str + "/default.jpg");
            return;
        }
        if (i == 3) {
            this.api.getVideo("https://vimeo.com/api/v2/video/" + str + ".json", new AnonymousClass2(videoPreviewView, thumbnailImageView, str));
            return;
        }
        if (i != 4) {
            return;
        }
        this.api.getVideo("https://www.useloom.com/v1/oembed?url=https://www.useloom.com/embed/" + str, new AnonymousClass3(videoPreviewView, str, thumbnailImageView));
    }

    /* renamed from: io.intercom.android.sdk.blocks.Video$2, reason: invalid class name */
    class AnonymousClass2 implements Callback {
        final /* synthetic */ String val$id;
        final /* synthetic */ VideoPreviewView val$previewView;
        final /* synthetic */ ImageView val$videoImageView;

        AnonymousClass2(VideoPreviewView videoPreviewView, ImageView imageView, String str) {
            this.val$previewView = videoPreviewView;
            this.val$videoImageView = imageView;
            this.val$id = str;
        }

        @Override // okhttp3.Callback
        public void onFailure(Call call, IOException iOException) {
            this.val$previewView.showFailedImage();
        }

        @Override // okhttp3.Callback
        public void onResponse(Call call, Response response) {
            if (response.isSuccessful()) {
                try {
                    if (response.body() != null) {
                        try {
                            final String string = new JSONArray(response.body().string()).getJSONObject(0).getString("thumbnail_large");
                            ImageView imageView = this.val$videoImageView;
                            final VideoPreviewView videoPreviewView = this.val$previewView;
                            final String str = this.val$id;
                            imageView.post(new Runnable() { // from class: io.intercom.android.sdk.blocks.Video$2$$ExternalSyntheticLambda0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    Video.AnonymousClass2.this.m11997lambda$onResponse$0$iointercomandroidsdkblocksVideo$2(videoPreviewView, str, string);
                                }
                            });
                        } catch (IOException e) {
                            Video.this.twig.internal("ErrorObject", "Couldn't read response body: " + e.getMessage());
                        } catch (JSONException e2) {
                            e2.printStackTrace();
                        }
                    }
                } finally {
                    response.body().close();
                }
            }
        }

        /* renamed from: lambda$onResponse$0$io-intercom-android-sdk-blocks-Video$2, reason: not valid java name */
        /* synthetic */ void m11997lambda$onResponse$0$iointercomandroidsdkblocksVideo$2(VideoPreviewView videoPreviewView, String str, String str2) {
            Video.this.createThumbnail(videoPreviewView, "https://player.vimeo.com/video/" + str, str2);
        }
    }

    /* renamed from: io.intercom.android.sdk.blocks.Video$3, reason: invalid class name */
    class AnonymousClass3 implements Callback {
        final /* synthetic */ String val$id;
        final /* synthetic */ VideoPreviewView val$previewView;
        final /* synthetic */ ImageView val$videoImageView;

        AnonymousClass3(VideoPreviewView videoPreviewView, String str, ImageView imageView) {
            this.val$previewView = videoPreviewView;
            this.val$id = str;
            this.val$videoImageView = imageView;
        }

        @Override // okhttp3.Callback
        public void onFailure(Call call, IOException iOException) {
            this.val$previewView.showFailedImage();
        }

        @Override // okhttp3.Callback
        public void onResponse(Call call, Response response) {
            if (response.isSuccessful()) {
                final String str = "https://www.useloom.com/embed/" + this.val$id;
                final String thumbnailUrlFromOembedResponse = Video.this.getThumbnailUrlFromOembedResponse(response);
                ImageView imageView = this.val$videoImageView;
                final VideoPreviewView videoPreviewView = this.val$previewView;
                imageView.post(new Runnable() { // from class: io.intercom.android.sdk.blocks.Video$3$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        Video.AnonymousClass3.this.m11998lambda$onResponse$0$iointercomandroidsdkblocksVideo$3(videoPreviewView, str, thumbnailUrlFromOembedResponse);
                    }
                });
                return;
            }
            this.val$previewView.showFailedImage();
        }

        /* renamed from: lambda$onResponse$0$io-intercom-android-sdk-blocks-Video$3, reason: not valid java name */
        /* synthetic */ void m11998lambda$onResponse$0$iointercomandroidsdkblocksVideo$3(VideoPreviewView videoPreviewView, String str, String str2) {
            Video.this.createThumbnail(videoPreviewView, str, str2);
        }
    }

    void createThumbnail(VideoPreviewView videoPreviewView, String str, String str2) {
        videoPreviewView.displayThumbnail(str2);
        addClickListenerOnThumbnailView(videoPreviewView.getThumbnailImageView(), str);
    }

    private void addClickListenerOnThumbnailView(final ImageView imageView, final String str) {
        if (this.style != StyleType.CHAT_FULL) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: io.intercom.android.sdk.blocks.Video.4
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
                    intent.setFlags(268435456);
                    IntentUtils.safelyOpenIntent(imageView.getContext(), intent);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String getThumbnailUrlFromOembedResponse(Response response) {
        JSONObject jSONObject = new JSONObject();
        try {
            try {
                JSONObject jSONObject2 = new JSONObject(response.body().string());
                response.body().close();
                jSONObject = jSONObject2;
            } catch (IOException e) {
                this.twig.internal("ErrorObject", "Couldn't read response body: " + e.getMessage());
                String optString = jSONObject.optString("thumbnail_url");
                int indexOf = optString.indexOf("?image_crop_resized");
                if (indexOf > 0) {
                }
            } catch (JSONException e2) {
                e2.printStackTrace();
                String optString2 = jSONObject.optString("thumbnail_url");
                int indexOf2 = optString2.indexOf("?image_crop_resized");
                if (indexOf2 > 0) {
                }
            }
            String optString22 = jSONObject.optString("thumbnail_url");
            int indexOf22 = optString22.indexOf("?image_crop_resized");
            return indexOf22 > 0 ? optString22.substring(0, indexOf22) : optString22;
        } finally {
            response.body().close();
        }
    }
}
