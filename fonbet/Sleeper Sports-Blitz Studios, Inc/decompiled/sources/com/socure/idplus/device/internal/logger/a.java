package com.socure.idplus.device.internal.logger;

import androidx.exifinterface.media.ExifInterface;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f870a;
    public static final /* synthetic */ a[] b;

    static {
        a aVar = new a(ExifInterface.LONGITUDE_EAST, 0);
        a aVar2 = new a("I", 1);
        a aVar3 = new a("D", 2);
        f870a = aVar3;
        a[] aVarArr = {aVar, aVar2, aVar3};
        b = aVarArr;
        EnumEntriesKt.enumEntries(aVarArr);
    }

    public a(String str, int i) {
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) b.clone();
    }
}
