package com.vk.clips.design.view.component.audio;

import android.content.Context;
import android.util.AttributeSet;
import com.airbnb.lottie.LottieAnimationView;
import com.vkontakte.android.R;
import xsna.epx;
import xsna.ho8;

/* compiled from: ClipsAudioToggle.kt */
/* loaded from: classes16.dex */
public final class ClipsAudioToggle extends LottieAnimationView {
    public int p;

    /* compiled from: ClipsAudioToggle.kt */
    public interface a {

        /* compiled from: ClipsAudioToggle.kt */
        /* renamed from: com.vk.clips.design.view.component.audio.ClipsAudioToggle$a$a, reason: collision with other inner class name */
        public static final class C0566a implements a {
            public final String a;

            public C0566a(String str) {
                this.a = str;
            }

            @Override // com.vk.clips.design.view.component.audio.ClipsAudioToggle.a
            public final int a() {
                return R.raw.volume_to_mute_shadow_24;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0566a) && epx.f(this.a, ((C0566a) obj).a);
            }

            @Override // com.vk.clips.design.view.component.audio.ClipsAudioToggle.a
            public final String getContentDescription() {
                return this.a;
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("Muted(contentDescription="), this.a, ')');
            }
        }

        /* compiled from: ClipsAudioToggle.kt */
        public static final class b implements a {
            public final String a;

            public b(String str) {
                this.a = str;
            }

            @Override // com.vk.clips.design.view.component.audio.ClipsAudioToggle.a
            public final int a() {
                return R.raw.mute_to_volume_shadow_24;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
            }

            @Override // com.vk.clips.design.view.component.audio.ClipsAudioToggle.a
            public final String getContentDescription() {
                return this.a;
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("Unmuted(contentDescription="), this.a, ')');
            }
        }

        int a();

        String getContentDescription();
    }

    public ClipsAudioToggle(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
