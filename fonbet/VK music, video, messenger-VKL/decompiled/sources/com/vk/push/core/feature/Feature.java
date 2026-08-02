package com.vk.push.core.feature;

import xsna.zcl;

/* compiled from: Feature.kt */
/* loaded from: classes.dex */
public abstract class Feature {
    public final String a;

    /* compiled from: Feature.kt */
    public static final class BooleanFeature extends Feature {
        public final boolean b;

        public BooleanFeature(String str, boolean z) {
            super(str, null);
            this.b = z;
        }

        public final boolean getDefaultValue() {
            return this.b;
        }
    }

    /* compiled from: Feature.kt */
    public static final class IntFeature extends Feature {
        public final int b;

        public IntFeature(String str, int i) {
            super(str, null);
            this.b = i;
        }

        public final int getDefaultValue() {
            return this.b;
        }
    }

    /* compiled from: Feature.kt */
    public static final class StringFeature extends Feature {
        public final String b;

        public StringFeature(String str, String str2) {
            super(str, null);
            this.b = str2;
        }

        public final String getDefaultValue() {
            return this.b;
        }
    }

    public Feature(String str, zcl zclVar) {
        this.a = str;
    }

    public final String getKey() {
        return this.a;
    }
}
