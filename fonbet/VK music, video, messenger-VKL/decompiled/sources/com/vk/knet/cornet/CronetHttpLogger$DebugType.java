package com.vk.knet.cornet;

import java.util.Set;
import kotlin.Lazy;
import xsna.asp;
import xsna.bpn0;
import xsna.j55;
import xsna.tog;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CronetHttpLogger.kt */
/* loaded from: classes.dex */
public final class CronetHttpLogger$DebugType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CronetHttpLogger$DebugType[] $VALUES;
    private static final Lazy<Set<CronetHttpLogger$DebugType>> ALL$delegate;
    public static final CronetHttpLogger$DebugType CLIENT_BUILDER;
    public static final CronetHttpLogger$DebugType CLIENT_CALLBACK;
    public static final CronetHttpLogger$DebugType CLIENT_QUEUE;
    public static final CronetHttpLogger$DebugType CLIENT_STATE;
    public static final CronetHttpLogger$DebugType CLIENT_TIMEOUTS;
    public static final a Companion;
    public static final CronetHttpLogger$DebugType EXEC_POOL;
    public static final CronetHttpLogger$DebugType NATIVE_BUFFER;
    private static final Lazy<Set<CronetHttpLogger$DebugType>> RELEASE$delegate;

    /* compiled from: CronetHttpLogger.kt */
    public static final class a {
    }

    static {
        CronetHttpLogger$DebugType cronetHttpLogger$DebugType = new CronetHttpLogger$DebugType("NATIVE_BUFFER", 0);
        NATIVE_BUFFER = cronetHttpLogger$DebugType;
        CronetHttpLogger$DebugType cronetHttpLogger$DebugType2 = new CronetHttpLogger$DebugType("EXEC_POOL", 1);
        EXEC_POOL = cronetHttpLogger$DebugType2;
        CronetHttpLogger$DebugType cronetHttpLogger$DebugType3 = new CronetHttpLogger$DebugType("CLIENT_TIMEOUTS", 2);
        CLIENT_TIMEOUTS = cronetHttpLogger$DebugType3;
        CronetHttpLogger$DebugType cronetHttpLogger$DebugType4 = new CronetHttpLogger$DebugType("CLIENT_QUEUE", 3);
        CLIENT_QUEUE = cronetHttpLogger$DebugType4;
        CronetHttpLogger$DebugType cronetHttpLogger$DebugType5 = new CronetHttpLogger$DebugType("CLIENT_CALLBACK", 4);
        CLIENT_CALLBACK = cronetHttpLogger$DebugType5;
        CronetHttpLogger$DebugType cronetHttpLogger$DebugType6 = new CronetHttpLogger$DebugType("CLIENT_BUILDER", 5);
        CLIENT_BUILDER = cronetHttpLogger$DebugType6;
        CronetHttpLogger$DebugType cronetHttpLogger$DebugType7 = new CronetHttpLogger$DebugType("CLIENT_STATE", 6);
        CLIENT_STATE = cronetHttpLogger$DebugType7;
        CronetHttpLogger$DebugType[] cronetHttpLogger$DebugTypeArr = {cronetHttpLogger$DebugType, cronetHttpLogger$DebugType2, cronetHttpLogger$DebugType3, cronetHttpLogger$DebugType4, cronetHttpLogger$DebugType5, cronetHttpLogger$DebugType6, cronetHttpLogger$DebugType7};
        $VALUES = cronetHttpLogger$DebugTypeArr;
        $ENTRIES = new asp(cronetHttpLogger$DebugTypeArr);
        Companion = new a();
        ALL$delegate = new bpn0(new tog(2));
        RELEASE$delegate = new bpn0(new j55(4));
    }

    public CronetHttpLogger$DebugType() {
        throw null;
    }

    public static CronetHttpLogger$DebugType valueOf(String str) {
        return (CronetHttpLogger$DebugType) Enum.valueOf(CronetHttpLogger$DebugType.class, str);
    }

    public static CronetHttpLogger$DebugType[] values() {
        return (CronetHttpLogger$DebugType[]) $VALUES.clone();
    }
}
