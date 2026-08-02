package com.vk.folders.impl.configure;

import com.vk.im.engine.models.dialogs.FolderType;
import xsna.epx;
import xsna.urd0;

/* compiled from: ConfigurationMode.kt */
/* loaded from: classes18.dex */
public interface a {

    /* compiled from: ConfigurationMode.kt */
    /* renamed from: com.vk.folders.impl.configure.a$a, reason: collision with other inner class name */
    public static final class C1068a implements a {
        public static final C1068a a = new C1068a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof C1068a);
        }

        public final int hashCode() {
            return 1509770962;
        }

        public final String toString() {
            return "Create";
        }
    }

    /* compiled from: ConfigurationMode.kt */
    public static final class b implements a {
        public final int a;
        public final String b;
        public final FolderType c;

        public b(int i, String str, FolderType folderType) {
            this.a = i;
            this.b = str;
            this.c = folderType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && epx.f(this.b, bVar.b) && this.c == bVar.c;
        }

        public final int hashCode() {
            return this.c.hashCode() + urd0.a(Integer.hashCode(this.a) * 31, 31, this.b);
        }

        public final String toString() {
            return "Edit(id=" + this.a + ", name=" + this.b + ", type=" + this.c + ')';
        }
    }
}
