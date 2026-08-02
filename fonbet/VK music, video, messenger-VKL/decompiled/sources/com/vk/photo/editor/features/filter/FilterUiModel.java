package com.vk.photo.editor.features.filter;

import android.graphics.Bitmap;
import xsna.aa00;
import xsna.asp;
import xsna.epx;
import xsna.oq;
import xsna.qoy;
import xsna.urd0;
import xsna.xe9;
import xsna.zrp;

/* compiled from: FilterUiModel.kt */
/* loaded from: classes4.dex */
public final class FilterUiModel {
    public final String a;
    public final String b;
    public final a c;
    public final boolean d;
    public final aa00 e;
    public final Type f;
    public final String g;
    public final boolean h;
    public final Integer i;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: FilterUiModel.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type GROUP_ENTRY_POINT;
        public static final Type SINGLE;
        public static final Type SUB_FILTER;

        static {
            Type type = new Type("SINGLE", 0);
            SINGLE = type;
            Type type2 = new Type("GROUP_ENTRY_POINT", 1);
            GROUP_ENTRY_POINT = type2;
            Type type3 = new Type("SUB_FILTER", 2);
            SUB_FILTER = type3;
            Type[] typeArr = {type, type2, type3};
            $VALUES = typeArr;
            $ENTRIES = new asp(typeArr);
        }

        public Type() {
            throw null;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    /* compiled from: FilterUiModel.kt */
    public static abstract class a {

        /* compiled from: FilterUiModel.kt */
        /* renamed from: com.vk.photo.editor.features.filter.FilterUiModel$a$a, reason: collision with other inner class name */
        public static final class C1456a extends a {
            public static final C1456a a = new C1456a();
        }

        /* compiled from: FilterUiModel.kt */
        public static final class b extends a {
            public final Bitmap a;

            public b(Bitmap bitmap) {
                this.a = bitmap;
            }
        }

        /* compiled from: FilterUiModel.kt */
        public static final class c extends a {
            public static final c a = new c();
        }
    }

    public FilterUiModel(String str, String str2, a aVar, boolean z, aa00 aa00Var, Type type, String str3, boolean z2, Integer num) {
        this.a = str;
        this.b = str2;
        this.c = aVar;
        this.d = z;
        this.e = aa00Var;
        this.f = type;
        this.g = str3;
        this.h = z2;
        this.i = num;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v3, types: [com.vk.photo.editor.features.filter.FilterUiModel$a] */
    public static FilterUiModel a(FilterUiModel filterUiModel, a.b bVar, boolean z, int i) {
        String str = filterUiModel.a;
        String str2 = filterUiModel.b;
        a.b bVar2 = bVar;
        if ((i & 4) != 0) {
            bVar2 = filterUiModel.c;
        }
        a.b bVar3 = bVar2;
        if ((i & 8) != 0) {
            z = filterUiModel.d;
        }
        aa00 aa00Var = filterUiModel.e;
        Type type = filterUiModel.f;
        String str3 = filterUiModel.g;
        boolean z2 = filterUiModel.h;
        Integer num = filterUiModel.i;
        filterUiModel.getClass();
        return new FilterUiModel(str, str2, bVar3, z, aa00Var, type, str3, z2, num);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FilterUiModel)) {
            return false;
        }
        FilterUiModel filterUiModel = (FilterUiModel) obj;
        return epx.f(this.a, filterUiModel.a) && epx.f(this.b, filterUiModel.b) && epx.f(this.c, filterUiModel.c) && this.d == filterUiModel.d && epx.f(this.e, filterUiModel.e) && this.f == filterUiModel.f && epx.f(this.g, filterUiModel.g) && this.h == filterUiModel.h && epx.f(this.i, filterUiModel.i);
    }

    public final int hashCode() {
        int hashCode = (this.f.hashCode() + ((this.e.hashCode() + qoy.b((this.c.hashCode() + urd0.a(this.a.hashCode() * 31, 31, this.b)) * 31, 31, this.d)) * 31)) * 31;
        String str = this.g;
        int b = qoy.b((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.h);
        Integer num = this.i;
        return b + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder a2 = xe9.a("FilterUiModel(id=", this.a, ", title=", this.b, ", preview=");
        a2.append(this.c);
        a2.append(", isSelected=");
        a2.append(this.d);
        a2.append(", wrapper=");
        a2.append(this.e);
        a2.append(", type=");
        a2.append(this.f);
        a2.append(", parentId=");
        a2.append(this.g);
        a2.append(", isDefault=");
        a2.append(this.h);
        a2.append(", indexInCategory=");
        return oq.b(a2, this.i, ")");
    }
}
