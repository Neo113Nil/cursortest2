package com.vk.catalog2.common.ui.holders.group.cell;

import io.reactivex.rxjava3.internal.operators.mixed.j;
import java.util.ArrayList;
import xsna.kju;
import xsna.vu5;

/* compiled from: GroupCellConfiguration.kt */
/* loaded from: classes16.dex */
public final class b {
    public final ArrayList a;
    public final a b;
    public final kju c;

    /* compiled from: GroupCellConfiguration.kt */
    public interface a {

        /* compiled from: GroupCellConfiguration.kt */
        /* renamed from: com.vk.catalog2.common.ui.holders.group.cell.b$a$a, reason: collision with other inner class name */
        public static final class C0486a implements a {
            public final ArrayList a;

            public C0486a(ArrayList arrayList) {
                this.a = arrayList;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0486a) && this.a.equals(((C0486a) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return j.b(')', new StringBuilder("FewUsers(userNames="), this.a);
            }
        }

        /* compiled from: GroupCellConfiguration.kt */
        /* renamed from: com.vk.catalog2.common.ui.holders.group.cell.b$a$b, reason: collision with other inner class name */
        public static final class C0487b implements a {
            public final int a;

            public C0487b(int i) {
                this.a = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0487b) && this.a == ((C0487b) obj).a;
            }

            public final int hashCode() {
                return Integer.hashCode(this.a);
            }

            public final String toString() {
                return vu5.b(new StringBuilder("ManyUsers(count="), this.a, ')');
            }
        }
    }

    public b(ArrayList arrayList, a aVar, kju kjuVar) {
        this.a = arrayList;
        this.b = aVar;
        this.c = kjuVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.a.equals(bVar.a) && this.b.equals(bVar.b) && this.c.equals(bVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "FriendsUserStack(userPhotos=" + this.a + ", text=" + this.b + ", memberCount=" + this.c + ')';
    }
}
