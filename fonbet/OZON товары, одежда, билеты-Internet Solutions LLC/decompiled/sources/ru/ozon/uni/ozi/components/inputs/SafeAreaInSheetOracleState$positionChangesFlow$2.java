package ru.ozon.uni.ozi.components.inputs;

import Ae.E0;
import Ae.w0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ze.EnumC11113a;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LAe/w0;", "", "invoke", "()LAe/w0;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes4.dex */
final class SafeAreaInSheetOracleState$positionChangesFlow$2 extends AbstractC7737t implements Function0<w0<Unit>> {
    public static final SafeAreaInSheetOracleState$positionChangesFlow$2 INSTANCE = new SafeAreaInSheetOracleState$positionChangesFlow$2();

    SafeAreaInSheetOracleState$positionChangesFlow$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final w0<Unit> invoke() {
        return E0.b(1, 0, EnumC11113a.DROP_OLDEST, 2);
    }
}
