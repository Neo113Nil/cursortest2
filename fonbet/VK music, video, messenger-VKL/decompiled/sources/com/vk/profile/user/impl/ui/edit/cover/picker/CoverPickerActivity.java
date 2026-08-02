package com.vk.profile.user.impl.ui.edit.cover.picker;

import android.content.Intent;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Bundle;
import androidx.activity.result.ActivityResult;
import com.vk.attachpicker.ImageFormatRestrictions;
import com.vk.attachpicker.ImageSizeLimits;
import com.vk.profile.user.impl.ui.edit.cover.crop.CoverCropActivity;
import com.vkontakte.android.VKActivity;
import java.util.ArrayList;
import java.util.Collections;
import kotlin.Pair;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.webrtc.mediarecord.VideoRecord;
import xsna.cb0;
import xsna.epx;
import xsna.g0t;
import xsna.hb0;
import xsna.r870;
import xsna.ua0;
import xsna.xzs;
import xsna.yfb;

/* compiled from: CoverPickerActivity.kt */
/* loaded from: classes5.dex */
public final class CoverPickerActivity extends VKActivity {
    public static final /* synthetic */ int A = 0;
    public String v;
    public RectF w;
    public boolean x = true;
    public final hb0<Intent> y = registerForActivityResult(new cb0(), new a());
    public final hb0<Intent> z = registerForActivityResult(new cb0(), new b());

    /* compiled from: CoverPickerActivity.kt */
    public static final /* synthetic */ class a implements ua0, g0t {
        public a() {
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof ua0) && (obj instanceof g0t)) {
                return epx.f(getFunctionDelegate(), ((g0t) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // xsna.g0t
        public final xzs<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(1, CoverPickerActivity.this, CoverPickerActivity.class, "handleCropperResult", "handleCropperResult(Landroidx/activity/result/ActivityResult;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // xsna.ua0
        public final void onActivityResult(Object obj) {
            ActivityResult activityResult = (ActivityResult) obj;
            int i = CoverPickerActivity.A;
            Intent intent = activityResult.c;
            int i2 = activityResult.b;
            CoverPickerActivity coverPickerActivity = CoverPickerActivity.this;
            if (i2 != -1 || intent == null) {
                coverPickerActivity.z.a(coverPickerActivity.T1());
                return;
            }
            intent.putExtra("is_from_gallery", coverPickerActivity.x);
            coverPickerActivity.setResult(-1, intent);
            coverPickerActivity.finish();
        }
    }

    /* compiled from: CoverPickerActivity.kt */
    public static final /* synthetic */ class b implements ua0, g0t {
        public b() {
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof ua0) && (obj instanceof g0t)) {
                return epx.f(getFunctionDelegate(), ((g0t) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // xsna.g0t
        public final xzs<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(1, CoverPickerActivity.this, CoverPickerActivity.class, "handlePickerResult", "handlePickerResult(Landroidx/activity/result/ActivityResult;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX WARN: Removed duplicated region for block: B:33:0x0062  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x0067  */
        @Override // xsna.ua0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void onActivityResult(Object obj) {
            Uri uri;
            ActivityResult activityResult = (ActivityResult) obj;
            int i = CoverPickerActivity.A;
            Intent intent = activityResult.c;
            int i2 = activityResult.b;
            CoverPickerActivity coverPickerActivity = CoverPickerActivity.this;
            if (i2 != -1 || intent == null) {
                coverPickerActivity.setResult(0);
                coverPickerActivity.finish();
                return;
            }
            String dataString = intent.getDataString();
            coverPickerActivity.x = true;
            if (dataString == null || dataString.length() == 0) {
                coverPickerActivity.x = false;
                Bundle bundleExtra = intent.getBundleExtra("result_attachments");
                if (bundleExtra != null) {
                    ArrayList parcelableArrayList = bundleExtra.getParcelableArrayList("result_files");
                    boolean[] booleanArray = bundleExtra.getBooleanArray("result_video_flags");
                    if (parcelableArrayList != null && booleanArray != null) {
                        int length = booleanArray.length;
                        int i3 = 0;
                        while (true) {
                            if (i3 >= length) {
                                i3 = -1;
                                break;
                            } else if (!booleanArray[i3]) {
                                break;
                            } else {
                                i3++;
                            }
                        }
                        Integer valueOf = Integer.valueOf(i3);
                        if (i3 == -1) {
                            valueOf = null;
                        }
                        if (valueOf != null) {
                            uri = (Uri) parcelableArrayList.get(valueOf.intValue());
                            dataString = uri == null ? uri.toString() : null;
                        }
                    }
                }
                uri = null;
                if (uri == null) {
                }
            }
            if (dataString != null && dataString.length() != 0) {
                coverPickerActivity.y.a(new Intent(coverPickerActivity, (Class<?>) CoverCropActivity.class).putExtras(yfb.b(new Pair("__cover_url_key__", dataString), new Pair("__avatar_url_key__", coverPickerActivity.v), new Pair("__avatar_rect_key__", coverPickerActivity.w))));
            } else {
                coverPickerActivity.setResult(0);
                coverPickerActivity.finish();
            }
        }
    }

    public final Intent T1() {
        Intent n = r870.a().e().n(this.i);
        n.putExtra("prevent_styling", true);
        n.putExtra("single_mode", true);
        n.putExtra("big_previews", true);
        n.putExtra("short_previews", true);
        n.putExtra("image_size_limits", new ImageSizeLimits(Integer.valueOf(VideoRecord.DEFAULT_MAX_DIMENSION), 384, 7000, 7000));
        n.putExtra("image_format_restrictions", new ImageFormatRestrictions(null, Collections.singletonList(".gif"), 1, null));
        return n;
    }

    @Override // com.vkontakte.android.VKActivity, com.vk.core.ui.themes.ThemableActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.v = getIntent().getStringExtra("__avatar_url_key__");
        this.w = (RectF) getIntent().getParcelableExtra("__avatar_rect_key__");
        this.z.a(T1());
    }
}
