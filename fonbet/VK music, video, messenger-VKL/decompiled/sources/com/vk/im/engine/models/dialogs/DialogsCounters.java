package com.vk.im.engine.models.dialogs;

import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import xsna.asp;
import xsna.fpf0;
import xsna.p5j;
import xsna.p7f0;
import xsna.pn00;
import xsna.qcy;
import xsna.xpp;
import xsna.zrp;

/* compiled from: DialogsCounters.kt */
/* loaded from: classes2.dex */
public final class DialogsCounters {
    public static final /* synthetic */ qcy<Object>[] i = {new MutablePropertyReference1Impl(DialogsCounters.class, "unread", "getUnread()Lcom/vk/im/engine/models/EntityValue;", 0), p5j.a(0, DialogsCounters.class, "unreadUnmuted", "getUnreadUnmuted()Lcom/vk/im/engine/models/EntityValue;", fpf0.a), new MutablePropertyReference1Impl(DialogsCounters.class, "businessNotifyUnread", "getBusinessNotifyUnread()Lcom/vk/im/engine/models/EntityValue;", 0), new MutablePropertyReference1Impl(DialogsCounters.class, "businessNotifyTotal", "getBusinessNotifyTotal()Lcom/vk/im/engine/models/EntityValue;", 0), new MutablePropertyReference1Impl(DialogsCounters.class, "messageRequests", "getMessageRequests()Lcom/vk/im/engine/models/EntityValue;", 0), new MutablePropertyReference1Impl(DialogsCounters.class, "archiveMentions", "getArchiveMentions()Lcom/vk/im/engine/models/EntityValue;", 0), new MutablePropertyReference1Impl(DialogsCounters.class, "archiveUnreadUnmuted", "getArchiveUnreadUnmuted()Lcom/vk/im/engine/models/EntityValue;", 0), new MutablePropertyReference1Impl(DialogsCounters.class, "archiveUnread", "getArchiveUnread()Lcom/vk/im/engine/models/EntityValue;", 0), new MutablePropertyReference1Impl(DialogsCounters.class, "archiveTotal", "getArchiveTotal()Lcom/vk/im/engine/models/EntityValue;", 0)};
    public final a a;
    public final a b;
    public final a c;
    public final a d;
    public final a e;
    public final a f;
    public final a g;
    public final LinkedHashMap h;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: DialogsCounters.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type ARCHIVE_MENTIONS;
        public static final Type ARCHIVE_TOTAL;
        public static final Type ARCHIVE_UNREAD;
        public static final Type ARCHIVE_UNREAD_UNMUTED;
        public static final Type BUSINESS_NOTIFY_TOTAL;
        public static final Type BUSINESS_NOTIFY_UNREAD;
        public static final a Companion;
        public static final Type REQUESTS;
        public static final Type UNREAD;
        public static final Type UNREAD_UNMUTED;
        private final int id;

        /* compiled from: DialogsCounters.kt */
        public static final class a {
        }

        static {
            Type type = new Type("UNREAD", 0, 1);
            UNREAD = type;
            Type type2 = new Type("REQUESTS", 1, 2);
            REQUESTS = type2;
            Type type3 = new Type("BUSINESS_NOTIFY_UNREAD", 2, 3);
            BUSINESS_NOTIFY_UNREAD = type3;
            Type type4 = new Type("UNREAD_UNMUTED", 3, 4);
            UNREAD_UNMUTED = type4;
            Type type5 = new Type("ARCHIVE_UNREAD", 4, 5);
            ARCHIVE_UNREAD = type5;
            Type type6 = new Type("ARCHIVE_UNREAD_UNMUTED", 5, 6);
            ARCHIVE_UNREAD_UNMUTED = type6;
            Type type7 = new Type("ARCHIVE_MENTIONS", 6, 7);
            ARCHIVE_MENTIONS = type7;
            Type type8 = new Type("ARCHIVE_TOTAL", 7, 8);
            ARCHIVE_TOTAL = type8;
            Type type9 = new Type("BUSINESS_NOTIFY_TOTAL", 8, 9);
            BUSINESS_NOTIFY_TOTAL = type9;
            Type[] typeArr = {type, type2, type3, type4, type5, type6, type7, type8, type9};
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

    /* compiled from: DialogsCounters.kt */
    public final class a implements p7f0<DialogsCounters, xpp<Integer>> {
        public final Type b;

        public a(Type type) {
            this.b = type;
        }

        public final xpp a() {
            Object obj = DialogsCounters.this.h.get(this.b);
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
        public final void setValue(DialogsCounters dialogsCounters, qcy qcyVar, xpp<Integer> xppVar) {
            DialogsCounters.this.h.put(this.b, xppVar);
        }
    }

    public DialogsCounters(xpp<Integer> xppVar, xpp<Integer> xppVar2, xpp<Integer> xppVar3, xpp<Integer> xppVar4, xpp<Integer> xppVar5, xpp<Integer> xppVar6, xpp<Integer> xppVar7, xpp<Integer> xppVar8, xpp<Integer> xppVar9) {
        Type type = Type.UNREAD;
        this.a = new a(type);
        Type type2 = Type.UNREAD_UNMUTED;
        this.b = new a(type2);
        Type type3 = Type.BUSINESS_NOTIFY_UNREAD;
        this.c = new a(type3);
        Type type4 = Type.BUSINESS_NOTIFY_TOTAL;
        this.d = new a(type4);
        Type type5 = Type.REQUESTS;
        this.e = new a(type5);
        Type type6 = Type.ARCHIVE_MENTIONS;
        this.f = new a(type6);
        Type type7 = Type.ARCHIVE_UNREAD_UNMUTED;
        Type type8 = Type.ARCHIVE_UNREAD;
        this.g = new a(type8);
        this.h = pn00.m(new Pair(type, xppVar), new Pair(type2, xppVar2), new Pair(type3, xppVar4), new Pair(type4, xppVar3), new Pair(type5, xppVar5), new Pair(type6, xppVar8), new Pair(type7, xppVar7), new Pair(type8, xppVar6), new Pair(Type.ARCHIVE_TOTAL, xppVar9));
    }

    public final xpp<Integer> a(Type type) {
        return (xpp) this.h.get(type);
    }

    public final xpp<Integer> b() {
        qcy<Object> qcyVar = i[5];
        return this.f.a();
    }

    public final xpp<Integer> c() {
        qcy<Object> qcyVar = i[7];
        return this.g.a();
    }
}
