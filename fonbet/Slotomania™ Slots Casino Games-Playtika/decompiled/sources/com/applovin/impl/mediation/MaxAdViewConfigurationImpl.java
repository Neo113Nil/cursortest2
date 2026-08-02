package com.applovin.impl.mediation;

import com.applovin.impl.sdk.p;
import com.applovin.mediation.MaxAdViewConfiguration;

/* loaded from: classes7.dex */
public class MaxAdViewConfigurationImpl extends MaxAdViewConfiguration {
    private final MaxAdViewConfiguration.AdaptiveType a;
    private final int b;
    private final int c;

    public static class BuilderImpl implements MaxAdViewConfiguration.Builder {
        private MaxAdViewConfiguration.AdaptiveType a = MaxAdViewConfiguration.AdaptiveType.NONE;
        private int b = -1;
        private int c = -1;

        @Override // com.applovin.mediation.MaxAdViewConfiguration.Builder
        public MaxAdViewConfiguration build() {
            return new MaxAdViewConfigurationImpl(this);
        }

        public MaxAdViewConfiguration.AdaptiveType getAdaptiveType() {
            return this.a;
        }

        public int getAdaptiveWidth() {
            return this.b;
        }

        public int getInlineMaximumHeight() {
            return this.c;
        }

        @Override // com.applovin.mediation.MaxAdViewConfiguration.Builder
        public MaxAdViewConfiguration.Builder setAdaptiveType(MaxAdViewConfiguration.AdaptiveType adaptiveType) {
            p.e("MaxAdViewConfiguration", "setAdaptiveType(adaptiveType=" + adaptiveType + ")");
            this.a = adaptiveType;
            return this;
        }

        @Override // com.applovin.mediation.MaxAdViewConfiguration.Builder
        public MaxAdViewConfiguration.Builder setAdaptiveWidth(int i) {
            p.e("MaxAdViewConfiguration", "setAdaptiveWidth(adaptiveWidth=" + i + ")");
            this.b = i;
            return this;
        }

        @Override // com.applovin.mediation.MaxAdViewConfiguration.Builder
        public MaxAdViewConfiguration.Builder setInlineMaximumHeight(int i) {
            p.e("MaxAdViewConfiguration", "setInlineMaximumHeight(inlineMaximumHeight=" + i + ")");
            this.c = i;
            return this;
        }

        public String toString() {
            return "MaxAdViewConfiguration.Builder{adaptiveType=" + this.a + ", adaptiveWidth=" + this.b + ", inlineMaximumHeight=" + this.c + "}";
        }
    }

    @Override // com.applovin.mediation.MaxAdViewConfiguration
    public MaxAdViewConfiguration.AdaptiveType getAdaptiveType() {
        return this.a;
    }

    @Override // com.applovin.mediation.MaxAdViewConfiguration
    public int getAdaptiveWidth() {
        return this.b;
    }

    @Override // com.applovin.mediation.MaxAdViewConfiguration
    public int getInlineMaximumHeight() {
        return this.c;
    }

    public String toString() {
        return "MaxAdViewConfiguration{adaptiveType=" + this.a + ", adaptiveWidth=" + this.b + ", inlineMaximumHeight=" + this.c + "}";
    }

    private MaxAdViewConfigurationImpl(BuilderImpl builderImpl) {
        this.a = builderImpl.a;
        this.b = builderImpl.b;
        this.c = builderImpl.c;
    }
}
