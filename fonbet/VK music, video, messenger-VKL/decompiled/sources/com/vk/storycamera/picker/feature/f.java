package com.vk.storycamera.picker.feature;

import xsna.vu5;

/* compiled from: StoryMediaPickerSideEffect.kt */
/* loaded from: classes6.dex */
public abstract class f {

    /* compiled from: StoryMediaPickerSideEffect.kt */
    public static final class a extends f {
        public final int a;

        public a(int i) {
            this.a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a == ((a) obj).a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("NewTemplateCount(count="), this.a, ')');
        }
    }
}
