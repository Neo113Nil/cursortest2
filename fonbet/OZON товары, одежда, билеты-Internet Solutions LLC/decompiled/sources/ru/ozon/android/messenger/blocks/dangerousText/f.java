package ru.ozon.android.messenger.blocks.dangerousText;

import Sc.o;
import a1.C4912a;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.C7705l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.presentation.common.view.recycler.i;
import ru.ozon.android.messenger.framework.presentation.common.view.recycler.q;
import ru.ozon.android.messenger.framework.presentation.common.view.timestatus.TimeStatusView;
import ru.ozon.android.messenger.framework.presentation.models.p;
import ru.ozon.android.messenger.framework.presentation.models.s;
import ru.ozon.app.android.messenger.databinding.MBlockDangerousTextBinding;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;

/* loaded from: classes10.dex */
public final class f extends q<e, MBlockDangerousTextBinding> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.core.d f84999a;

    static final class a extends AbstractC7737t implements Function1<MBlockDangerousTextBinding, Unit> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ e f85001c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ p f85002d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ru.ozon.android.messenger.framework.presentation.models.d f85003e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Object f85004f;

        /* renamed from: ru.ozon.android.messenger.blocks.dangerousText.f$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C1488a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f85005a;

            static {
                int[] iArr = new int[i.a.values().length];
                try {
                    iArr[i.a.STATUS_CHANGED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                f85005a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(e eVar, p pVar, ru.ozon.android.messenger.framework.presentation.models.d dVar, Object obj) {
            super(1);
            this.f85001c = eVar;
            this.f85002d = pVar;
            this.f85003e = dVar;
            this.f85004f = obj;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(MBlockDangerousTextBinding mBlockDangerousTextBinding) {
            MBlockDangerousTextBinding withBinding = mBlockDangerousTextBinding;
            Intrinsics.checkNotNullParameter(withBinding, "$this$withBinding");
            f fVar = f.this;
            e eVar = this.f85001c;
            p pVar = this.f85002d;
            ru.ozon.android.messenger.framework.presentation.models.d dVar = this.f85003e;
            Object obj = this.f85004f;
            f.super.bind(eVar, pVar, dVar, obj);
            if (!(pVar instanceof s)) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            withBinding.dangerousTextView.a(new C4912a(true, 74779042, new i(eVar, fVar)));
            if (obj != null) {
                List list = obj instanceof List ? (List) obj : null;
                if (list == null || list.isEmpty()) {
                    list = C7705l.f0(i.a.values());
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (C1488a.f85005a[((i.a) ((Enum) it.next())).ordinal()] != 1) {
                        throw new o();
                    }
                    f.d(fVar, withBinding, eVar, (s) pVar);
                }
            } else {
                f.d(fVar, withBinding, eVar, (s) pVar);
            }
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(@NotNull MBlockDangerousTextBinding binding, @NotNull ru.ozon.android.messenger.framework.core.d references) {
        super(binding, references);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(references, "references");
        this.f84999a = references;
    }

    public static final void c(e eVar, f fVar) {
        CommonControlSettings common;
        ru.ozon.android.messenger.framework.navigation.controller.a c11 = fVar.f84999a.c();
        ButtonV3DTO a11 = eVar.a();
        AtomActionDTO atomActionDTO = null;
        c11.m(ru.ozon.android.messenger.framework.analytics.h.a(a11 != null ? a11.getTrackingInfo() : null));
        ButtonV3DTO a12 = eVar.a();
        if (a12 != null && (common = a12.getCommon()) != null) {
            atomActionDTO = common.getAction();
        }
        c11.q(ru.ozon.android.messenger.framework.navigation.action.b.c(atomActionDTO));
    }

    public static final void d(f fVar, MBlockDangerousTextBinding mBlockDangerousTextBinding, e eVar, s sVar) {
        fVar.getClass();
        String sendTime = eVar.getSendTime();
        if (sendTime == null) {
            sendTime = "";
        }
        ru.ozon.android.messenger.framework.presentation.common.view.timestatus.d dVar = new ru.ozon.android.messenger.framework.presentation.common.view.timestatus.d(sendTime, sVar.k(), sVar.n());
        TimeStatusView timeStatusView = mBlockDangerousTextBinding.timeStatusView;
        Intrinsics.checkNotNullExpressionValue(timeStatusView, "timeStatusView");
        dVar.a(timeStatusView);
    }

    @Override // ru.ozon.android.messenger.framework.presentation.common.view.recycler.q
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final void bind(@NotNull e block, @NotNull p itemInfo, @NotNull ru.ozon.android.messenger.framework.presentation.models.d blockInfo, Object obj) {
        Intrinsics.checkNotNullParameter(block, "block");
        Intrinsics.checkNotNullParameter(itemInfo, "itemInfo");
        Intrinsics.checkNotNullParameter(blockInfo, "blockInfo");
        withBinding(new a(block, itemInfo, blockInfo, obj));
    }
}
