package com.vk.mvi.core.internal.executors;

import android.os.Looper;
import kotlin.NoWhenBranchMatchedException;
import xsna.asp;
import xsna.rl3;
import xsna.un50;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ThreadType.kt */
/* loaded from: classes3.dex */
public final class ThreadType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ThreadType[] $VALUES;
    public static final a Companion;
    public static final ThreadType MAIN;
    public static final ThreadType STATE;
    public static final ThreadType UTIL;
    private static boolean isDebug;

    /* compiled from: ThreadType.kt */
    public static final class a {

        /* compiled from: ThreadType.kt */
        /* renamed from: com.vk.mvi.core.internal.executors.ThreadType$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C1361a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[ThreadType.values().length];
                try {
                    iArr[ThreadType.STATE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ThreadType.UTIL.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[ThreadType.MAIN.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public static void a(ThreadType... threadTypeArr) {
            if (ThreadType.isDebug) {
                Thread currentThread = Thread.currentThread();
                for (ThreadType threadType : threadTypeArr) {
                    int i = C1361a.$EnumSwitchMapping$0[threadType.ordinal()];
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            if (currentThread == Looper.getMainLooper().getThread()) {
                                return;
                            }
                        } else if ((currentThread instanceof un50) && ((un50) currentThread).b == ThreadType.UTIL) {
                            return;
                        }
                    } else if ((currentThread instanceof un50) && ((un50) currentThread).b == ThreadType.STATE) {
                        return;
                    }
                }
                throw new IllegalThreadStateException("Assert thread on type is failed [" + rl3.u0(threadTypeArr) + "], but is was " + currentThread);
            }
        }
    }

    static {
        ThreadType threadType = new ThreadType("UTIL", 0);
        UTIL = threadType;
        ThreadType threadType2 = new ThreadType("STATE", 1);
        STATE = threadType2;
        ThreadType threadType3 = new ThreadType("MAIN", 2);
        MAIN = threadType3;
        ThreadType[] threadTypeArr = {threadType, threadType2, threadType3};
        $VALUES = threadTypeArr;
        $ENTRIES = new asp(threadTypeArr);
        Companion = new a();
        isDebug = true;
    }

    public ThreadType() {
        throw null;
    }

    public static ThreadType valueOf(String str) {
        return (ThreadType) Enum.valueOf(ThreadType.class, str);
    }

    public static ThreadType[] values() {
        return (ThreadType[]) $VALUES.clone();
    }
}
