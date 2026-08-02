package com.braze.ui.inappmessage.utils;

import android.content.Context;
import com.braze.Braze;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.enums.BrazeViewBounds;
import com.braze.enums.inappmessage.InAppMessageFailureType;
import com.braze.enums.inappmessage.MessageType;
import com.braze.images.IBrazeImageLoader;
import com.braze.models.inappmessage.IInAppMessage;
import com.braze.models.inappmessage.IInAppMessageWithImage;
import com.braze.models.inappmessage.IInAppMessageZippedAssetHtml;
import com.braze.models.inappmessage.InAppMessageFull;
import com.braze.models.inappmessage.InAppMessageHtml;
import com.braze.support.BrazeLogger;
import com.braze.support.WebContentUtils;
import com.braze.ui.inappmessage.BrazeInAppMessageManager;
import java.io.File;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;

/* compiled from: BackgroundInAppMessagePreparer.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0019\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J8\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\tH\u0002J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0016\u001a\u00020\u0006H\u0002J\u0010\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0006H\u0007J\u0012\u0010\u0018\u001a\u00020\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007J\u0010\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u001aH\u0007J\u0010\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001e"}, d2 = {"Lcom/braze/ui/inappmessage/utils/BackgroundInAppMessagePreparer;", "", "()V", "displayPreparedInAppMessage", "", "inAppMessage", "Lcom/braze/models/inappmessage/IInAppMessage;", "(Lcom/braze/models/inappmessage/IInAppMessage;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getViewBoundsByType", "Lcom/braze/enums/BrazeViewBounds;", "handleLocalImage", "", "localImageUrl", "", "inAppMessageWithImage", "Lcom/braze/models/inappmessage/IInAppMessageWithImage;", "imageLoader", "Lcom/braze/images/IBrazeImageLoader;", "applicationContext", "Landroid/content/Context;", "viewBounds", "prepareInAppMessage", "inAppMessageToPrepare", "prepareInAppMessageForDisplay", "prepareInAppMessageWithBitmapDownload", "prepareInAppMessageWithHtml", "Lcom/braze/models/inappmessage/InAppMessageHtml;", "prepareInAppMessageWithZippedAssetHtml", "inAppMessageHtml", "Lcom/braze/models/inappmessage/IInAppMessageZippedAssetHtml;", "android-sdk-ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BackgroundInAppMessagePreparer {
    public static final BackgroundInAppMessagePreparer INSTANCE = new BackgroundInAppMessagePreparer();

    /* compiled from: BackgroundInAppMessagePreparer.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MessageType.values().length];
            iArr[MessageType.HTML_FULL.ordinal()] = 1;
            iArr[MessageType.HTML.ordinal()] = 2;
            iArr[MessageType.SLIDEUP.ordinal()] = 3;
            iArr[MessageType.MODAL.ordinal()] = 4;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private BackgroundInAppMessagePreparer() {
    }

    @JvmStatic
    public static final void prepareInAppMessageForDisplay(IInAppMessage inAppMessageToPrepare) {
        Intrinsics.checkNotNullParameter(inAppMessageToPrepare, "inAppMessageToPrepare");
        BuildersKt__Builders_commonKt.launch$default(BrazeCoroutineScope.INSTANCE, null, null, new BackgroundInAppMessagePreparer$prepareInAppMessageForDisplay$1(inAppMessageToPrepare, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final IInAppMessage prepareInAppMessage(IInAppMessage inAppMessageToPrepare) {
        if (inAppMessageToPrepare.isControl()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.inappmessage.utils.BackgroundInAppMessagePreparer$prepareInAppMessage$1
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Skipping in-app message preparation for control in-app message.";
                }
            }, 3, (Object) null);
            return inAppMessageToPrepare;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.inappmessage.utils.BackgroundInAppMessagePreparer$prepareInAppMessage$2
            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "Starting asynchronous in-app message preparation for message.";
            }
        }, 3, (Object) null);
        int i = WhenMappings.$EnumSwitchMapping$0[inAppMessageToPrepare.getMessageType().ordinal()];
        if (i != 1) {
            if (i == 2) {
                prepareInAppMessageWithHtml((InAppMessageHtml) inAppMessageToPrepare);
                return inAppMessageToPrepare;
            }
            if (!prepareInAppMessageWithBitmapDownload(inAppMessageToPrepare)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.inappmessage.utils.BackgroundInAppMessagePreparer$prepareInAppMessage$4
                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "Logging in-app message image download failure";
                    }
                }, 2, (Object) null);
                inAppMessageToPrepare.logDisplayFailure(InAppMessageFailureType.IMAGE_DOWNLOAD);
                return null;
            }
        } else if (!prepareInAppMessageWithZippedAssetHtml((IInAppMessageZippedAssetHtml) inAppMessageToPrepare)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.inappmessage.utils.BackgroundInAppMessagePreparer$prepareInAppMessage$3
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Logging html in-app message zip asset download failure";
                }
            }, 2, (Object) null);
            inAppMessageToPrepare.logDisplayFailure(InAppMessageFailureType.ZIP_ASSET_DOWNLOAD);
            return null;
        }
        return inAppMessageToPrepare;
    }

    @JvmStatic
    public static final boolean prepareInAppMessageWithZippedAssetHtml(final IInAppMessageZippedAssetHtml inAppMessageHtml) {
        Intrinsics.checkNotNullParameter(inAppMessageHtml, "inAppMessageHtml");
        final String localAssetsDirectoryUrl = inAppMessageHtml.getLocalAssetsDirectoryUrl();
        String str = localAssetsDirectoryUrl;
        if (str != null && !StringsKt.isBlank(str) && new File(localAssetsDirectoryUrl).exists()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, BrazeLogger.Priority.I, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.inappmessage.utils.BackgroundInAppMessagePreparer$prepareInAppMessageWithZippedAssetHtml$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return Intrinsics.stringPlus("Local assets for html in-app message are already populated. Not downloading assets. Location = ", localAssetsDirectoryUrl);
                }
            }, 2, (Object) null);
            return true;
        }
        String assetsZipRemoteUrl = inAppMessageHtml.getAssetsZipRemoteUrl();
        String str2 = assetsZipRemoteUrl;
        if (str2 == null || StringsKt.isBlank(str2)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, BrazeLogger.Priority.I, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.inappmessage.utils.BackgroundInAppMessagePreparer$prepareInAppMessageWithZippedAssetHtml$2
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Html in-app message has no remote asset zip. Continuing with in-app message preparation.";
                }
            }, 2, (Object) null);
            return true;
        }
        Context applicationContext = BrazeInAppMessageManager.INSTANCE.getInstance().getMApplicationContext();
        if (applicationContext == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, BrazeLogger.Priority.W, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.inappmessage.utils.BackgroundInAppMessagePreparer$prepareInAppMessageWithZippedAssetHtml$3
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "BrazeInAppMessageManager applicationContext is null. Not downloading image.";
                }
            }, 2, (Object) null);
            return false;
        }
        final String localHtmlUrlFromRemoteUrl = WebContentUtils.getLocalHtmlUrlFromRemoteUrl(WebContentUtils.getHtmlInAppMessageAssetCacheDirectory(applicationContext), assetsZipRemoteUrl);
        String str3 = localHtmlUrlFromRemoteUrl;
        if (str3 != null && !StringsKt.isBlank(str3)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.inappmessage.utils.BackgroundInAppMessagePreparer$prepareInAppMessageWithZippedAssetHtml$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return Intrinsics.stringPlus("Local url for html in-app message assets is ", localHtmlUrlFromRemoteUrl);
                }
            }, 3, (Object) null);
            inAppMessageHtml.setLocalAssetsDirectoryUrl(localHtmlUrlFromRemoteUrl);
            return true;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, BrazeLogger.Priority.W, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.inappmessage.utils.BackgroundInAppMessagePreparer$prepareInAppMessageWithZippedAssetHtml$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "Download of html content to local directory failed for remote url: " + ((Object) IInAppMessageZippedAssetHtml.this.getAssetsZipRemoteUrl()) + " . Returned local url is: " + ((Object) localHtmlUrlFromRemoteUrl);
            }
        }, 2, (Object) null);
        return false;
    }

    @JvmStatic
    public static final boolean prepareInAppMessageWithBitmapDownload(IInAppMessage inAppMessage) {
        if (!(inAppMessage instanceof IInAppMessageWithImage)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.inappmessage.utils.BackgroundInAppMessagePreparer$prepareInAppMessageWithBitmapDownload$1
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Cannot prepare non IInAppMessageWithImage object with bitmap download.";
                }
            }, 3, (Object) null);
            return false;
        }
        IInAppMessageWithImage iInAppMessageWithImage = (IInAppMessageWithImage) inAppMessage;
        if (iInAppMessageWithImage.getBitmap() != null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, BrazeLogger.Priority.I, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.inappmessage.utils.BackgroundInAppMessagePreparer$prepareInAppMessageWithBitmapDownload$2
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "In-app message already contains image bitmap. Not downloading image from URL.";
                }
            }, 2, (Object) null);
            iInAppMessageWithImage.setImageDownloadSuccessful(true);
            return true;
        }
        BackgroundInAppMessagePreparer backgroundInAppMessagePreparer = INSTANCE;
        BrazeViewBounds viewBoundsByType = backgroundInAppMessagePreparer.getViewBoundsByType(inAppMessage);
        Context applicationContext = BrazeInAppMessageManager.INSTANCE.getInstance().getMApplicationContext();
        if (applicationContext == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, backgroundInAppMessagePreparer, BrazeLogger.Priority.W, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.inappmessage.utils.BackgroundInAppMessagePreparer$prepareInAppMessageWithBitmapDownload$3
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "BrazeInAppMessageManager applicationContext is null. Not downloading image.";
                }
            }, 2, (Object) null);
            return false;
        }
        IBrazeImageLoader imageLoader = Braze.INSTANCE.getInstance(applicationContext).getImageLoader();
        String localImageUrl = iInAppMessageWithImage.getLocalImageUrl();
        String str = localImageUrl;
        if (str != null && !StringsKt.isBlank(str) && backgroundInAppMessagePreparer.handleLocalImage(localImageUrl, iInAppMessageWithImage, imageLoader, applicationContext, inAppMessage, viewBoundsByType)) {
            return true;
        }
        final String remoteImageUrl = iInAppMessageWithImage.getRemoteImageUrl();
        String str2 = remoteImageUrl;
        if (str2 != null && !StringsKt.isBlank(str2)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, backgroundInAppMessagePreparer, BrazeLogger.Priority.I, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.inappmessage.utils.BackgroundInAppMessagePreparer$prepareInAppMessageWithBitmapDownload$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return Intrinsics.stringPlus("In-app message has remote image url. Downloading image at url: ", remoteImageUrl);
                }
            }, 2, (Object) null);
            iInAppMessageWithImage.setBitmap(imageLoader.getInAppMessageBitmapFromUrl(applicationContext, inAppMessage, remoteImageUrl, viewBoundsByType));
            if (iInAppMessageWithImage.getBitmap() == null) {
                return false;
            }
            iInAppMessageWithImage.setImageDownloadSuccessful(true);
            return true;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, backgroundInAppMessagePreparer, BrazeLogger.Priority.W, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.inappmessage.utils.BackgroundInAppMessagePreparer$prepareInAppMessageWithBitmapDownload$5
            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "In-app message has no remote image url. Not downloading image.";
            }
        }, 2, (Object) null);
        if (!(iInAppMessageWithImage instanceof InAppMessageFull)) {
            return true;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, backgroundInAppMessagePreparer, BrazeLogger.Priority.W, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.inappmessage.utils.BackgroundInAppMessagePreparer$prepareInAppMessageWithBitmapDownload$6
            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "In-app message full has no remote image url yet is required to have an image. Failing message display.";
            }
        }, 2, (Object) null);
        return false;
    }

    private final boolean handleLocalImage(final String localImageUrl, IInAppMessageWithImage inAppMessageWithImage, IBrazeImageLoader imageLoader, Context applicationContext, IInAppMessage inAppMessage, BrazeViewBounds viewBounds) {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.inappmessage.utils.BackgroundInAppMessagePreparer$handleLocalImage$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return Intrinsics.stringPlus("Passing in-app message local image url to image loader: ", localImageUrl);
            }
        }, 2, (Object) null);
        inAppMessageWithImage.setBitmap(imageLoader.getInAppMessageBitmapFromUrl(applicationContext, inAppMessage, localImageUrl, viewBounds));
        if (inAppMessageWithImage.getBitmap() != null) {
            inAppMessageWithImage.setImageDownloadSuccessful(true);
            return true;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.inappmessage.utils.BackgroundInAppMessagePreparer$handleLocalImage$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return Intrinsics.stringPlus("Removing local image url from IAM since it could not be loaded. URL: ", localImageUrl);
            }
        }, 3, (Object) null);
        inAppMessageWithImage.setLocalImageUrl(null);
        return false;
    }

    public final void prepareInAppMessageWithHtml(InAppMessageHtml inAppMessage) {
        Intrinsics.checkNotNullParameter(inAppMessage, "inAppMessage");
        if (inAppMessage.getLocalPrefetchedAssetPaths().isEmpty()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.inappmessage.utils.BackgroundInAppMessagePreparer$prepareInAppMessageWithHtml$1
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "HTML in-app message does not have prefetched assets. Not performing any substitutions.";
                }
            }, 3, (Object) null);
            return;
        }
        String message = inAppMessage.getMessage();
        if (message == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.inappmessage.utils.BackgroundInAppMessagePreparer$prepareInAppMessageWithHtml$2
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "HTML in-app message does not have message. Not performing any substitutions.";
                }
            }, 3, (Object) null);
        } else {
            inAppMessage.setMessage(WebContentUtils.replacePrefetchedUrlsWithLocalAssets(message, inAppMessage.getLocalPrefetchedAssetPaths()));
        }
    }

    private final BrazeViewBounds getViewBoundsByType(IInAppMessage inAppMessage) {
        int i = WhenMappings.$EnumSwitchMapping$0[inAppMessage.getMessageType().ordinal()];
        if (i == 3) {
            return BrazeViewBounds.IN_APP_MESSAGE_SLIDEUP;
        }
        if (i == 4) {
            return BrazeViewBounds.IN_APP_MESSAGE_MODAL;
        }
        return BrazeViewBounds.NO_BOUNDS;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object displayPreparedInAppMessage(IInAppMessage iInAppMessage, Continuation<? super Unit> continuation) {
        Object withContext = BuildersKt.withContext(Dispatchers.getMain(), new BackgroundInAppMessagePreparer$displayPreparedInAppMessage$2(this, iInAppMessage, null), continuation);
        return withContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : Unit.INSTANCE;
    }
}
