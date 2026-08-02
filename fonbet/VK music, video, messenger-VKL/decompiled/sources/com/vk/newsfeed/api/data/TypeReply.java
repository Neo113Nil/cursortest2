package com.vk.newsfeed.api.data;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TypeReply.kt */
/* loaded from: classes3.dex */
public final class TypeReply {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ TypeReply[] $VALUES;
    public static final TypeReply Click;
    public static final TypeReply Swipe;

    static {
        TypeReply typeReply = new TypeReply("Click", 0);
        Click = typeReply;
        TypeReply typeReply2 = new TypeReply("Swipe", 1);
        Swipe = typeReply2;
        TypeReply[] typeReplyArr = {typeReply, typeReply2};
        $VALUES = typeReplyArr;
        $ENTRIES = new asp(typeReplyArr);
    }

    public TypeReply() {
        throw null;
    }

    public static TypeReply valueOf(String str) {
        return (TypeReply) Enum.valueOf(TypeReply.class, str);
    }

    public static TypeReply[] values() {
        return (TypeReply[]) $VALUES.clone();
    }
}
