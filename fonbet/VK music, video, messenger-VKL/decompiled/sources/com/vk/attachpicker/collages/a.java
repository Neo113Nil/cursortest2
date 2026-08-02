package com.vk.attachpicker.collages;

import android.content.Context;
import android.os.Bundle;
import androidx.compose.runtime.a;
import androidx.compose.runtime.f;
import androidx.compose.runtime.k;
import com.vk.dto.common.VideoFileOld;
import com.vk.dto.common.VideoUrl;
import com.vk.dto.common.VideoUrlStorage;
import com.vk.movika.tools.controls.seekbar.r;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.a470;
import xsna.dw20;
import xsna.fsk;
import xsna.gzs;
import xsna.jmu0;
import xsna.kai;
import xsna.kmu0;
import xsna.myc0;
import xsna.s3q0;
import xsna.tzp0;
import xsna.wh50;
import xsna.xf4;
import xsna.zak0;

/* compiled from: CollageOnboardingBottomSheet.kt */
/* loaded from: classes15.dex */
public final class a extends jmu0 {
    public static final /* synthetic */ int k1 = 0;
    public final wh50 h1 = k.b(null);
    public final wh50 i1 = k.b("");
    public final wh50 j1 = k.b("");

    /* compiled from: CollageOnboardingBottomSheet.kt */
    /* renamed from: com.vk.attachpicker.collages.a$a, reason: collision with other inner class name */
    public static final class C0382a extends kmu0 {
        public final String h;
        public final String i;
        public final String j;

        public C0382a(Context context, String str, String str2, String str3) {
            super(context, tzp0.a(null, 3));
            this.h = str;
            this.i = str2;
            this.j = str3;
            F0(true);
            n0(0);
            o0(0);
            m0(0);
            c(new a470());
        }

        @Override // xsna.dw20.b, xsna.dw20.a
        public final dw20 f() {
            a aVar = new a();
            Bundle bundle = new Bundle();
            bundle.putString("ONBOARDING_VIDEO", this.h);
            bundle.putString("VIDEO_TEXT", this.i);
            bundle.putString("BUTTON_TEXT_KEY", this.j);
            aVar.setArguments(bundle);
            return aVar;
        }
    }

    /* compiled from: CollageOnboardingBottomSheet.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            ((a) this.receiver).hide();
            return s3q0.a;
        }
    }

    @Override // xsna.jmu0
    public final void co(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(-371683387);
        int i2 = (M.y(this) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-371683387, i2, -1, "com.vk.attachpicker.collages.CollageOnboardingBottomSheet.ThemedContent (CollageOnboardingBottomSheet.kt:51)");
            }
            Object x = M.x();
            if (x == a.C0011a.a) {
                x = Collections.singletonList(s3q0.a);
                M.R(x);
            }
            fsk.b.k(6, M, kai.c(306489319, new xf4(3, this, (List) x), M));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        f s = M.s();
        if (s != null) {
            s.d = new r(this, i, 1);
        }
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String str;
        String str2;
        String string;
        super.onCreate(bundle);
        VideoFileOld videoFileOld = new VideoFileOld();
        videoFileOld.z = false;
        HashMap hashMap = new HashMap();
        VideoUrl videoUrl = VideoUrl.EXTERNAL_URL;
        Bundle arguments = getArguments();
        String str3 = "";
        if (arguments == null || (str = arguments.getString("ONBOARDING_VIDEO")) == null) {
            str = "";
        }
        if (!myc0.f(str)) {
            str = null;
        }
        if (str != null) {
            VideoUrlStorage.b bVar = VideoUrlStorage.c;
            VideoUrlStorage.d.b(hashMap, videoUrl, str);
        }
        videoFileOld.f = new VideoUrlStorage(hashMap);
        ((zak0) this.h1).setValue(videoFileOld);
        Bundle arguments2 = getArguments();
        if (arguments2 == null || (str2 = arguments2.getString("VIDEO_TEXT")) == null) {
            str2 = "";
        }
        ((zak0) this.i1).setValue(str2);
        Bundle arguments3 = getArguments();
        if (arguments3 != null && (string = arguments3.getString("BUTTON_TEXT_KEY")) != null) {
            str3 = string;
        }
        ((zak0) this.j1).setValue(str3);
    }
}
