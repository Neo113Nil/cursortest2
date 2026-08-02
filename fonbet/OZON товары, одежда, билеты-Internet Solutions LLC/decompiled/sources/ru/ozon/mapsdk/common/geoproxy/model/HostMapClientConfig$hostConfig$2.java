package ru.ozon.mapsdk.common.geoproxy.model;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import za0.InterfaceC11014a;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lza0/a;", "invoke", "()Lza0/a;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes3.dex */
final class HostMapClientConfig$hostConfig$2 extends AbstractC7737t implements Function0<InterfaceC11014a> {
    final /* synthetic */ HostMapClientConfig this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HostMapClientConfig$hostConfig$2(HostMapClientConfig hostMapClientConfig) {
        super(0);
        this.this$0 = hostMapClientConfig;
    }

    @Override // kotlin.jvm.functions.Function0
    public final InterfaceC11014a invoke() {
        return (InterfaceC11014a) this.this$0.getLimbDiStore$mapsdk_fullFirebaseOpenglRelease().e(InterfaceC11014a.class);
    }
}
