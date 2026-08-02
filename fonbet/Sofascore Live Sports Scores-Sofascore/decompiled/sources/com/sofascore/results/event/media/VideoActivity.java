package com.sofascore.results.event.media;

import android.os.Bundle;
import androidx.compose.runtime.e;
import com.sofascore.results.event.media.VideoActivity;
import com.sofascore.results.mvvm.base.AbstractActivity;
import defpackage.e1d;
import defpackage.eoh;
import defpackage.mqi;
import defpackage.tc3;
import defpackage.ypa;
import defpackage.zb3;
import defpackage.zok;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sofascore/results/event/media/VideoActivity;", "Lcom/sofascore/results/mvvm/base/AbstractActivity;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class VideoActivity extends AbstractActivity {
    public static final /* synthetic */ int M = 0;
    public final mqi J;
    public final mqi K;
    public final e1d L = e.f(Boolean.FALSE);

    public VideoActivity() {
        final int i = 0;
        this.J = ypa.b(new Function0(this) { // from class: yok
            public final /* synthetic */ VideoActivity b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                VideoActivity videoActivity = this.b;
                switch (i2) {
                    case 0:
                        int i3 = VideoActivity.M;
                        String stringExtra = videoActivity.getIntent().getStringExtra("video_url");
                        return stringExtra == null ? "" : stringExtra;
                    default:
                        int i4 = VideoActivity.M;
                        String stringExtra2 = videoActivity.getIntent().getStringExtra("thumbnail_url");
                        return stringExtra2 == null ? "" : stringExtra2;
                }
            }
        });
        final int i2 = 1;
        this.K = ypa.b(new Function0(this) { // from class: yok
            public final /* synthetic */ VideoActivity b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                VideoActivity videoActivity = this.b;
                switch (i22) {
                    case 0:
                        int i3 = VideoActivity.M;
                        String stringExtra = videoActivity.getIntent().getStringExtra("video_url");
                        return stringExtra == null ? "" : stringExtra;
                    default:
                        int i4 = VideoActivity.M;
                        String stringExtra2 = videoActivity.getIntent().getStringExtra("thumbnail_url");
                        return stringExtra2 == null ? "" : stringExtra2;
                }
            }
        });
    }

    @Override // com.sofascore.results.mvvm.base.AbstractActivity, com.sofascore.results.base.BaseActivity, com.sofascore.results.base.Hilt_BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        zb3.a(this, new tc3(740904164, new zok(this, 0), true));
    }

    @Override // com.sofascore.results.base.BaseActivity
    public final String u() {
        return "VideoPlayer";
    }

    @Override // com.sofascore.results.base.BaseActivity
    /* renamed from: x */
    public final boolean getN() {
        return ((Boolean) ((eoh) this.L).getValue()).booleanValue();
    }

    @Override // com.sofascore.results.mvvm.base.AbstractActivity
    public final void N() {
    }
}
