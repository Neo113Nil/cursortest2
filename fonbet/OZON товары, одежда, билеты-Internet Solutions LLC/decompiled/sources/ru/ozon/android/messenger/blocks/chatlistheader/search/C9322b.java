package ru.ozon.android.messenger.blocks.chatlistheader.search;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.android.messenger.blocks.chatlistheader.f;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;

/* renamed from: ru.ozon.android.messenger.blocks.chatlistheader.search.b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C9322b extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.blocks.chatlistheader.f f84797b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.core.d f84798c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C9322b(ru.ozon.android.messenger.blocks.chatlistheader.f fVar, ru.ozon.android.messenger.framework.core.d dVar) {
        super(0);
        this.f84797b = fVar;
        this.f84798c = dVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Map<String, TokenizedTrackingInfo> trackingInfo;
        ButtonV3DTO b11 = ((f.c.a) this.f84797b.d()).b();
        ru.ozon.android.messenger.framework.core.d dVar = this.f84798c;
        if (b11 != null && (trackingInfo = b11.getTrackingInfo()) != null) {
            dVar.c().m(ru.ozon.android.messenger.framework.analytics.h.a(trackingInfo));
        }
        dVar.d().requireActivity().onBackPressed();
        return Unit.f71690a;
    }
}
