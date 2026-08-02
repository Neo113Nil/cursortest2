package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.ads.zzcd;
import defpackage.w00;
import defpackage.xwo;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzcd {
    public final zzgvc a;
    public final Handler b;
    public xwo c;
    public zzd d;
    public int f;
    public zzch h;
    public float g = 1.0f;
    public int e = 0;

    public zzcd(Context context, Looper looper, xwo xwoVar) {
        this.a = zzgvf.a(new w00(context, 2));
        this.c = xwoVar;
        this.b = new Handler(looper);
    }

    public final void a(zzd zzdVar) {
        if (Objects.equals(this.d, zzdVar)) {
            return;
        }
        this.d = zzdVar;
        this.f = zzdVar == null ? 0 : 1;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [arn] */
    public final int b(int i, boolean z) {
        if (i == 1 || this.f != 1) {
            d();
            e(0);
            return 1;
        }
        int i2 = this.e;
        if (z) {
            if (i2 != 2) {
                if (this.h == null) {
                    zzd zzdVar = zzd.b;
                    zzd zzdVar2 = this.d;
                    zzdVar2.getClass();
                    this.h = new zzch(new AudioManager.OnAudioFocusChangeListener() { // from class: arn
                        @Override // android.media.AudioManager.OnAudioFocusChangeListener
                        public final void onAudioFocusChange(int i3) {
                            zzcd zzcdVar = zzcd.this;
                            zzcdVar.getClass();
                            if (i3 == -3 || i3 == -2) {
                                if (i3 != -2) {
                                    zzcdVar.e(4);
                                    return;
                                }
                                xwo xwoVar = zzcdVar.c;
                                if (xwoVar != null) {
                                    xwoVar.g.zze(33, 0, 0).a();
                                }
                                zzcdVar.e(3);
                                return;
                            }
                            if (i3 == -1) {
                                xwo xwoVar2 = zzcdVar.c;
                                if (xwoVar2 != null) {
                                    xwoVar2.g.zze(33, -1, 0).a();
                                }
                                zzcdVar.d();
                                zzcdVar.e(1);
                                return;
                            }
                            if (i3 != 1) {
                                x5n.p(i3, "Unknown focus change type: ", new StringBuilder(String.valueOf(i3).length() + 27));
                                return;
                            }
                            zzcdVar.e(2);
                            xwo xwoVar3 = zzcdVar.c;
                            if (xwoVar3 != null) {
                                xwoVar3.g.zze(33, 1, 0).a();
                            }
                        }
                    }, this.b, zzdVar2, true);
                }
                AudioManager audioManager = (AudioManager) this.a.mo792zza();
                AudioFocusRequest audioFocusRequest = this.h.d;
                audioFocusRequest.getClass();
                int requestAudioFocus = audioManager.requestAudioFocus(audioFocusRequest);
                if (requestAudioFocus == 1 || requestAudioFocus == 2) {
                    e(2);
                    return 1;
                }
                e(1);
                return -1;
            }
        } else {
            if (i2 == 1) {
                return -1;
            }
            if (i2 == 3) {
                return 0;
            }
        }
        return 1;
    }

    public final void c() {
        this.c = null;
        d();
        e(0);
    }

    public final void d() {
        int i = this.e;
        if (i == 1 || i == 0 || this.h == null) {
            return;
        }
        AudioManager audioManager = (AudioManager) this.a.mo792zza();
        AudioFocusRequest audioFocusRequest = this.h.d;
        audioFocusRequest.getClass();
        audioManager.abandonAudioFocusRequest(audioFocusRequest);
    }

    public final void e(int i) {
        if (this.e == i) {
            return;
        }
        this.e = i;
        float f = i == 4 ? 0.2f : 1.0f;
        if (this.g != f) {
            this.g = f;
            xwo xwoVar = this.c;
            if (xwoVar != null) {
                xwoVar.g.g(34);
            }
        }
    }
}
