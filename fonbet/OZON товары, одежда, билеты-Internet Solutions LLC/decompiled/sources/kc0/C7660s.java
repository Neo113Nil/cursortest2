package kc0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.android.component.sheet.SheetView;

/* renamed from: kc0.s, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C7660s extends AbstractC7737t implements Function1<String, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ SheetView f71393b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C7645c f71394c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C7660s(SheetView sheetView, C7645c c7645c) {
        super(1);
        this.f71393b = sheetView;
        this.f71394c = c7645c;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        String actionLink = str;
        Intrinsics.checkNotNullParameter(actionLink, "actionLink");
        this.f71393b.dismiss();
        this.f71394c.C().C1(actionLink);
        return Unit.f71690a;
    }
}
