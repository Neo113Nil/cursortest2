package com.sofascore.results.event.media;

import android.os.Build;
import android.os.Bundle;
import android.view.Window;
import com.sofascore.results.event.media.FullScreenVideoActivity;
import com.sofascore.results.mvvm.base.AbstractActivity;
import defpackage.aal;
import defpackage.bka;
import defpackage.fs8;
import defpackage.mqi;
import defpackage.pea;
import defpackage.tc3;
import defpackage.wrh;
import defpackage.y9l;
import defpackage.ypa;
import defpackage.z9l;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sofascore/results/event/media/FullScreenVideoActivity;", "Lcom/sofascore/results/mvvm/base/AbstractActivity;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FullScreenVideoActivity extends AbstractActivity {
    public static final /* synthetic */ int O = 0;
    public final mqi J;
    public final mqi K;
    public final mqi L;
    public final mqi M;
    public final boolean N = true;

    public FullScreenVideoActivity() {
        final int i = 0;
        this.J = ypa.b(new Function0(this) { // from class: gs8
            public final /* synthetic */ FullScreenVideoActivity b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                FullScreenVideoActivity fullScreenVideoActivity = this.b;
                switch (i2) {
                    case 0:
                        int i3 = FullScreenVideoActivity.O;
                        return wrh.b(fullScreenVideoActivity.getLayoutInflater(), null, false);
                    case 1:
                        int i4 = FullScreenVideoActivity.O;
                        String stringExtra = fullScreenVideoActivity.getIntent().getStringExtra("video_url");
                        return stringExtra == null ? "" : stringExtra;
                    case 2:
                        int i5 = FullScreenVideoActivity.O;
                        String stringExtra2 = fullScreenVideoActivity.getIntent().getStringExtra("thumbnail_url");
                        return stringExtra2 == null ? "" : stringExtra2;
                    default:
                        int i6 = FullScreenVideoActivity.O;
                        return Long.valueOf(fullScreenVideoActivity.getIntent().getLongExtra("current_position", 0L));
                }
            }
        });
        final int i2 = 1;
        this.K = ypa.b(new Function0(this) { // from class: gs8
            public final /* synthetic */ FullScreenVideoActivity b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                FullScreenVideoActivity fullScreenVideoActivity = this.b;
                switch (i22) {
                    case 0:
                        int i3 = FullScreenVideoActivity.O;
                        return wrh.b(fullScreenVideoActivity.getLayoutInflater(), null, false);
                    case 1:
                        int i4 = FullScreenVideoActivity.O;
                        String stringExtra = fullScreenVideoActivity.getIntent().getStringExtra("video_url");
                        return stringExtra == null ? "" : stringExtra;
                    case 2:
                        int i5 = FullScreenVideoActivity.O;
                        String stringExtra2 = fullScreenVideoActivity.getIntent().getStringExtra("thumbnail_url");
                        return stringExtra2 == null ? "" : stringExtra2;
                    default:
                        int i6 = FullScreenVideoActivity.O;
                        return Long.valueOf(fullScreenVideoActivity.getIntent().getLongExtra("current_position", 0L));
                }
            }
        });
        final int i3 = 2;
        this.L = ypa.b(new Function0(this) { // from class: gs8
            public final /* synthetic */ FullScreenVideoActivity b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                FullScreenVideoActivity fullScreenVideoActivity = this.b;
                switch (i22) {
                    case 0:
                        int i32 = FullScreenVideoActivity.O;
                        return wrh.b(fullScreenVideoActivity.getLayoutInflater(), null, false);
                    case 1:
                        int i4 = FullScreenVideoActivity.O;
                        String stringExtra = fullScreenVideoActivity.getIntent().getStringExtra("video_url");
                        return stringExtra == null ? "" : stringExtra;
                    case 2:
                        int i5 = FullScreenVideoActivity.O;
                        String stringExtra2 = fullScreenVideoActivity.getIntent().getStringExtra("thumbnail_url");
                        return stringExtra2 == null ? "" : stringExtra2;
                    default:
                        int i6 = FullScreenVideoActivity.O;
                        return Long.valueOf(fullScreenVideoActivity.getIntent().getLongExtra("current_position", 0L));
                }
            }
        });
        final int i4 = 3;
        this.M = ypa.b(new Function0(this) { // from class: gs8
            public final /* synthetic */ FullScreenVideoActivity b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i4;
                FullScreenVideoActivity fullScreenVideoActivity = this.b;
                switch (i22) {
                    case 0:
                        int i32 = FullScreenVideoActivity.O;
                        return wrh.b(fullScreenVideoActivity.getLayoutInflater(), null, false);
                    case 1:
                        int i42 = FullScreenVideoActivity.O;
                        String stringExtra = fullScreenVideoActivity.getIntent().getStringExtra("video_url");
                        return stringExtra == null ? "" : stringExtra;
                    case 2:
                        int i5 = FullScreenVideoActivity.O;
                        String stringExtra2 = fullScreenVideoActivity.getIntent().getStringExtra("thumbnail_url");
                        return stringExtra2 == null ? "" : stringExtra2;
                    default:
                        int i6 = FullScreenVideoActivity.O;
                        return Long.valueOf(fullScreenVideoActivity.getIntent().getLongExtra("current_position", 0L));
                }
            }
        });
    }

    @Override // com.sofascore.results.mvvm.base.AbstractActivity, com.sofascore.results.base.BaseActivity, com.sofascore.results.base.Hilt_BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.x.f = "X";
        Window window = getWindow();
        bka bkaVar = new bka(getWindow().getDecorView());
        int i = Build.VERSION.SDK_INT;
        pea aalVar = i >= 35 ? new aal(window, bkaVar) : i >= 30 ? new z9l(window, bkaVar) : new y9l(window, bkaVar);
        aalVar.D();
        aalVar.x(519);
        mqi mqiVar = this.J;
        setContentView(((wrh) mqiVar.getValue()).a);
        ((wrh) mqiVar.getValue()).b.setContent(new tc3(-248188301, new fs8(this, 0), true));
    }

    @Override // com.sofascore.results.base.BaseActivity
    public final String u() {
        return "VideoFullScreen";
    }

    @Override // com.sofascore.results.base.BaseActivity
    /* renamed from: x, reason: from getter */
    public final boolean getN() {
        return this.N;
    }

    @Override // com.sofascore.results.mvvm.base.AbstractActivity
    public final void N() {
    }
}
