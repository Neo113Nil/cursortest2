package com.braze.triggers.enums;

import com.facebook.share.internal.ShareConstants;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f812a;
    public static final b b;
    public static final b c;
    public static final /* synthetic */ b[] d;

    static {
        b bVar = new b("ZIP", 0);
        f812a = bVar;
        b bVar2 = new b(ShareConstants.IMAGE_URL, 1);
        b = bVar2;
        b bVar3 = new b("FILE", 2);
        c = bVar3;
        b[] bVarArr = {bVar, bVar2, bVar3};
        d = bVarArr;
        EnumEntriesKt.enumEntries(bVarArr);
    }

    public b(String str, int i) {
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) d.clone();
    }
}
