package com.vk.im.engine.models.channels;

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

/* compiled from: ChannelsCounters.kt */
/* loaded from: classes2.dex */
public final class ChannelsCounters {
    public final b a;
    public final b b;
    public final b c;
    public final b d;
    public final LinkedHashMap e;
    public static final /* synthetic */ qcy<Object>[] g = {new MutablePropertyReference1Impl(ChannelsCounters.class, "unread", "getUnread()Lcom/vk/im/engine/models/EntityValue;", 0), p5j.a(0, ChannelsCounters.class, "unreadUnmuted", "getUnreadUnmuted()Lcom/vk/im/engine/models/EntityValue;", fpf0.a), new MutablePropertyReference1Impl(ChannelsCounters.class, "archived", "getArchived()Lcom/vk/im/engine/models/EntityValue;", 0), new MutablePropertyReference1Impl(ChannelsCounters.class, "suggested", "getSuggested()Lcom/vk/im/engine/models/EntityValue;", 0)};
    public static final a f = new a();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ChannelsCounters.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type ARCHIVED;
        public static final a Companion;
        public static final Type SUGGESTED;
        public static final Type UNREAD;
        public static final Type UNREAD_UNMUTED;
        private final int id;

        /* compiled from: ChannelsCounters.kt */
        public static final class a {
        }

        static {
            Type type = new Type("UNREAD", 0, 1);
            UNREAD = type;
            Type type2 = new Type("UNREAD_UNMUTED", 1, 2);
            UNREAD_UNMUTED = type2;
            Type type3 = new Type("ARCHIVED", 2, 3);
            ARCHIVED = type3;
            Type type4 = new Type("SUGGESTED", 3, 4);
            SUGGESTED = type4;
            Type[] typeArr = {type, type2, type3, type4};
            $VALUES = typeArr;
            $ENTRIES = new asp(typeArr);
            Companion = new a();
        }

        public Type(String str, int i, int i2) {
            this.id = i2;
        }

        public static zrp<Type> h() {
            return $ENTRIES;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }

        public final int i() {
            return this.id;
        }
    }

    /* compiled from: ChannelsCounters.kt */
    public static final class a {
        public static ChannelsCounters a() {
            return new ChannelsCounters(new xpp(0, false), new xpp(0, false), new xpp(0, false), new xpp(0, false));
        }
    }

    /* compiled from: ChannelsCounters.kt */
    public final class b implements p7f0<ChannelsCounters, xpp<Integer>> {
        public final Type b;

        public b(Type type) {
            this.b = type;
        }

        public final xpp a() {
            Object obj = ChannelsCounters.this.e.get(this.b);
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
        public final void setValue(ChannelsCounters channelsCounters, qcy qcyVar, xpp<Integer> xppVar) {
            ChannelsCounters.this.e.put(this.b, xppVar);
        }
    }

    public ChannelsCounters(xpp<Integer> xppVar, xpp<Integer> xppVar2, xpp<Integer> xppVar3, xpp<Integer> xppVar4) {
        Type type = Type.UNREAD;
        this.a = new b(type);
        Type type2 = Type.UNREAD_UNMUTED;
        this.b = new b(type2);
        Type type3 = Type.ARCHIVED;
        this.c = new b(type3);
        Type type4 = Type.SUGGESTED;
        this.d = new b(type4);
        this.e = pn00.m(new Pair(type, xppVar), new Pair(type2, xppVar2), new Pair(type3, xppVar3), new Pair(type4, xppVar4));
    }

    public final xpp<Integer> a() {
        qcy<Object> qcyVar = g[3];
        return this.d.a();
    }

    public final xpp<Integer> b() {
        qcy<Object> qcyVar = g[0];
        return this.a.a();
    }

    public final xpp<Integer> c() {
        qcy<Object> qcyVar = g[1];
        return this.b.a();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return ChannelsCounters.class.equals(obj != null ? obj.getClass() : null) && epx.f(this.e, ((ChannelsCounters) obj).e);
    }

    public final int hashCode() {
        return this.e.hashCode();
    }

    public final String toString() {
        return "ChannelsCounters(values=" + this.e + ')';
    }
}
