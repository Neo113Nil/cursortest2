package com.vk.clips.editor.state.model;

import xsna.vu5;

/* compiled from: ClipsEditorItem.kt */
/* loaded from: classes16.dex */
public interface e {

    /* compiled from: ClipsEditorItem.kt */
    public static final class a implements e {
        public static final a a = new a();
    }

    /* compiled from: ClipsEditorItem.kt */
    public static final class b implements e {
        public final long a;

        public b(long j) {
            this.a = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.a == ((b) obj).a;
        }

        public final int hashCode() {
            return Long.hashCode(this.a);
        }

        public final String toString() {
            return vu5.a(')', this.a, new StringBuilder("FromStart(offsetMs="));
        }
    }
}
