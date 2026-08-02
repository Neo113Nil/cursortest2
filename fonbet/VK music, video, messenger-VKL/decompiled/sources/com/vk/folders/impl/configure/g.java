package com.vk.folders.impl.configure;

import com.vk.im.engine.models.dialogs.FolderType;
import defpackage.q0;
import xsna.epx;
import xsna.ho8;
import xsna.kj50;
import xsna.vu5;
import xsna.wt90;

/* compiled from: FolderConfigurationViewAction.kt */
/* loaded from: classes18.dex */
public abstract class g implements kj50 {

    /* compiled from: FolderConfigurationViewAction.kt */
    public static final class a extends g {
        public static final a b = new a();
    }

    /* compiled from: FolderConfigurationViewAction.kt */
    public static final class b extends g {
        public final FolderType b;
        public final boolean c;

        public b(FolderType folderType, boolean z) {
            this.b = folderType;
            this.c = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.b == bVar.b && this.c == bVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + (this.b.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ChangeCounterSettingAction(type=");
            sb.append(this.b);
            sb.append(", isChecked=");
            return q0.a(sb, this.c, ')');
        }
    }

    /* compiled from: FolderConfigurationViewAction.kt */
    public static final class c extends g {
        public static final c b = new c();
    }

    /* compiled from: FolderConfigurationViewAction.kt */
    public static final class d extends g {
        public final int b;

        public d(int i) {
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.b == ((d) obj).b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("FolderConfigurationPeersListScrolled(lastVisibleIndex="), this.b, ')');
        }
    }

    /* compiled from: FolderConfigurationViewAction.kt */
    public static final class e extends g {
        public static final e b = new e();
    }

    /* compiled from: FolderConfigurationViewAction.kt */
    public static final class f extends g {
        public static final f b = new f();
    }

    /* compiled from: FolderConfigurationViewAction.kt */
    /* renamed from: com.vk.folders.impl.configure.g$g, reason: collision with other inner class name */
    public static final class C1069g extends g {
        public final wt90 b;

        public C1069g(wt90 wt90Var) {
            this.b = wt90Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1069g) && epx.f(this.b, ((C1069g) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "PeerDeleteClick(peer=" + this.b + ')';
        }
    }

    /* compiled from: FolderConfigurationViewAction.kt */
    public static final class h extends g {
        public final wt90 b;

        public h(wt90 wt90Var) {
            this.b = wt90Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && epx.f(this.b, ((h) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "PeerMoreClickAction(peer=" + this.b + ')';
        }
    }

    /* compiled from: FolderConfigurationViewAction.kt */
    public static final class i extends g {
        public static final i b = new i();
    }

    /* compiled from: FolderConfigurationViewAction.kt */
    public static final class j extends g {
        public final String b;

        public j(String str) {
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && epx.f(this.b, ((j) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("SelectedNameChangeAction(newName="), this.b, ')');
        }
    }
}
