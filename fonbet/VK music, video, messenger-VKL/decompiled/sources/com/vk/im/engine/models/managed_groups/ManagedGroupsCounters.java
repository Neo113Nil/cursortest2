package com.vk.im.engine.models.managed_groups;

import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import xsna.asp;
import xsna.epx;
import xsna.fpf0;
import xsna.p5j;
import xsna.p7f0;
import xsna.pn00;
import xsna.qcy;
import xsna.xpp;
import xsna.zrp;

/* compiled from: ManagedGroupsCounters.kt */
/* loaded from: classes2.dex */
public final class ManagedGroupsCounters {
    public final b a;
    public final b b;
    public final b c;
    public final LinkedHashMap d;
    public static final /* synthetic */ qcy<Object>[] f = {new MutablePropertyReference1Impl(ManagedGroupsCounters.class, "totalGroups", "getTotalGroups()Lcom/vk/im/engine/models/EntityValue;", 0), p5j.a(0, ManagedGroupsCounters.class, "dialogsUnreadCount", "getDialogsUnreadCount()Lcom/vk/im/engine/models/EntityValue;", fpf0.a), new MutablePropertyReference1Impl(ManagedGroupsCounters.class, "dialogsUnreadUnmutedCount", "getDialogsUnreadUnmutedCount()Lcom/vk/im/engine/models/EntityValue;", 0)};
    public static final a e = new a();
    public static final ManagedGroupsCounters g = new ManagedGroupsCounters(new xpp(0, false), new xpp(0, false), new xpp(0, false));

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ManagedGroupsCounters.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type DIALOGS_UNREAD;
        public static final Type DIALOGS_UNREAD_UNMUTED;
        public static final Type TOTAL_GROUPS;
        private final int id;

        static {
            Type type = new Type("TOTAL_GROUPS", 0, 1);
            TOTAL_GROUPS = type;
            Type type2 = new Type("DIALOGS_UNREAD", 1, 2);
            DIALOGS_UNREAD = type2;
            Type type3 = new Type("DIALOGS_UNREAD_UNMUTED", 2, 3);
            DIALOGS_UNREAD_UNMUTED = type3;
            Type[] typeArr = {type, type2, type3};
            $VALUES = typeArr;
            $ENTRIES = new asp(typeArr);
        }

        public Type(String str, int i, int i2) {
            this.id = i2;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    /* compiled from: ManagedGroupsCounters.kt */
    public static final class a {
    }

    /* compiled from: ManagedGroupsCounters.kt */
    public final class b implements p7f0<ManagedGroupsCounters, xpp<Integer>> {
        public final Type b;

        public b(Type type) {
            this.b = type;
        }

        public final xpp a() {
            Object obj = ManagedGroupsCounters.this.d.get(this.b);
            if (obj != null) {
                return (xpp) obj;
            }
            throw new IllegalArgumentException("Required value was null.");
        }

        @Override // xsna.i7f0
        public final /* bridge */ /* synthetic */ Object getValue(Object obj, qcy qcyVar) {
            return a();
        }

        @Override // xsna.p7f0
        public final void setValue(ManagedGroupsCounters managedGroupsCounters, qcy qcyVar, xpp<Integer> xppVar) {
            ManagedGroupsCounters.this.d.put(this.b, xppVar);
        }
    }

    public ManagedGroupsCounters(xpp<Integer> xppVar, xpp<Integer> xppVar2, xpp<Integer> xppVar3) {
        Type type = Type.TOTAL_GROUPS;
        this.a = new b(type);
        Type type2 = Type.DIALOGS_UNREAD;
        this.b = new b(type2);
        Type type3 = Type.DIALOGS_UNREAD_UNMUTED;
        this.c = new b(type3);
        this.d = pn00.m(new Pair(type, xppVar), new Pair(type2, xppVar2), new Pair(type3, xppVar3));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return ManagedGroupsCounters.class.equals(obj != null ? obj.getClass() : null) && epx.f(this.d, ((ManagedGroupsCounters) obj).d);
    }

    public final int hashCode() {
        return this.d.hashCode();
    }
}
