package com.vk.id.onetap.compose.onetap;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/vk/id/onetap/compose/onetap/OneTapTitleScenario;", "", "<init>", "(Ljava/lang/String;I)V", "SignIn", "SignUp", "Get", "Open", "Calculate", "Order", "PlaceOrder", "SendRequest", "Participate", "onetap-compose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class OneTapTitleScenario {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ OneTapTitleScenario[] $VALUES;
    public static final OneTapTitleScenario SignIn = new OneTapTitleScenario("SignIn", 0);
    public static final OneTapTitleScenario SignUp = new OneTapTitleScenario("SignUp", 1);
    public static final OneTapTitleScenario Get = new OneTapTitleScenario("Get", 2);
    public static final OneTapTitleScenario Open = new OneTapTitleScenario("Open", 3);
    public static final OneTapTitleScenario Calculate = new OneTapTitleScenario("Calculate", 4);
    public static final OneTapTitleScenario Order = new OneTapTitleScenario("Order", 5);
    public static final OneTapTitleScenario PlaceOrder = new OneTapTitleScenario("PlaceOrder", 6);
    public static final OneTapTitleScenario SendRequest = new OneTapTitleScenario("SendRequest", 7);
    public static final OneTapTitleScenario Participate = new OneTapTitleScenario("Participate", 8);

    private static final /* synthetic */ OneTapTitleScenario[] $values() {
        return new OneTapTitleScenario[]{SignIn, SignUp, Get, Open, Calculate, Order, PlaceOrder, SendRequest, Participate};
    }

    static {
        OneTapTitleScenario[] $values = $values();
        $VALUES = $values;
        $ENTRIES = Xc.b.a($values);
    }

    private OneTapTitleScenario(String str, int i11) {
    }

    public static OneTapTitleScenario valueOf(String str) {
        return (OneTapTitleScenario) Enum.valueOf(OneTapTitleScenario.class, str);
    }

    public static OneTapTitleScenario[] values() {
        return (OneTapTitleScenario[]) $VALUES.clone();
    }
}
