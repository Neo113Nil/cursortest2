package ru.ozon.android.messenger.blocks.pinneditem;

import android.view.View;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.framework.analytics.h;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;

/* loaded from: classes10.dex */
final class c extends AbstractC7737t implements Function1<View, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ IconButtonV3DTO f86037b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.core.d f86038c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(IconButtonV3DTO iconButtonV3DTO, ru.ozon.android.messenger.framework.core.d dVar) {
        super(1);
        this.f86037b = iconButtonV3DTO;
        this.f86038c = dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        View it = view;
        Intrinsics.checkNotNullParameter(it, "it");
        IconButtonV3DTO iconButtonV3DTO = this.f86037b;
        Map<String, TokenizedTrackingInfo> trackingInfo = iconButtonV3DTO.getTrackingInfo();
        ru.ozon.android.messenger.framework.core.d dVar = this.f86038c;
        if (trackingInfo != null) {
            dVar.c().m(h.a(trackingInfo));
        }
        ru.ozon.android.messenger.framework.navigation.controller.a c11 = dVar.c();
        CommonControlSettings common = iconButtonV3DTO.getCommon();
        c11.q(ru.ozon.android.messenger.framework.navigation.action.b.c(common != null ? common.getAction() : null));
        return Unit.f71690a;
    }
}
