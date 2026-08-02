package com.vk.music.onboarding.impl.di;

import com.vk.di.component.DiScopedWithParamsComponent;
import com.vk.music.analytics.api.di.MusicAnalyticsComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.epx;
import xsna.fpf0;
import xsna.ho8;
import xsna.l9i;
import xsna.m3g;
import xsna.nwy;
import xsna.pkx;
import xsna.qcy;

/* compiled from: InternalOnboardingComponent.kt */
/* loaded from: classes3.dex */
public final class InternalOnboardingComponent implements DiScopedWithParamsComponent<pkx, b> {
    public static final a d;
    public static final /* synthetic */ qcy<Object>[] e;
    public final b a;
    public final MusicAnalyticsComponent b;
    public final nwy c = new nwy(new m3g(this, 24));

    /* compiled from: InternalOnboardingComponent.kt */
    public static final class a {
    }

    /* compiled from: InternalOnboardingComponent.kt */
    public static final class b implements l9i {
        public final Class<?> a;
        public final String b;

        public b(Class<?> cls, String str) {
            this.a = cls;
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b);
        }

        @Override // xsna.l9i
        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            String str = this.b;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Params(caller=");
            sb.append(this.a);
            sb.append(", scenario=");
            return ho8.a(sb, this.b, ')');
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(InternalOnboardingComponent.class, "model", "getModel()Lcom/vk/music/onboarding/impl/model/RecommendationOnBoardingModel;", 0);
        fpf0.a.getClass();
        e = new qcy[]{propertyReference1Impl};
        d = new a();
    }

    public InternalOnboardingComponent(b bVar, MusicAnalyticsComponent musicAnalyticsComponent) {
        this.a = bVar;
        this.b = musicAnalyticsComponent;
    }
}
