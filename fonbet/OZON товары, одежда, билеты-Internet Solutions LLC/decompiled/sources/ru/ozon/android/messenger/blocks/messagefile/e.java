package ru.ozon.android.messenger.blocks.messagefile;

import Sc.o;
import We.E;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.G;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.C7705l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import qj.C9067a;
import qj.C9070d;
import ru.ozon.android.messenger.framework.core.initialization.newinit.d;
import ru.ozon.android.messenger.framework.navigation.controller.d;
import ru.ozon.android.messenger.framework.presentation.common.notification.g;
import ru.ozon.android.messenger.framework.presentation.common.view.recycler.i;
import ru.ozon.android.messenger.framework.presentation.common.view.recycler.q;
import ru.ozon.android.messenger.framework.presentation.common.view.timestatus.TimeStatusView;
import ru.ozon.android.messenger.framework.presentation.models.p;
import ru.ozon.android.messenger.framework.presentation.models.s;
import ru.ozon.android.messenger.utils.file.a;
import ru.ozon.android.messenger.utils.view.n;
import ru.ozon.android.networkinfo.models.NetworkInfo;
import ru.ozon.app.android.messenger.R$string;
import ru.ozon.app.android.messenger.databinding.MBlockFileBinding;
import ru.ozon.uni.android.notificationbar.CoordinatorLayoutManagerKt;
import ru.ozon.uni.core.UniTextStyles;

/* loaded from: classes10.dex */
public final class e extends q<c, MBlockFileBinding> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.core.d f85706a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final E f85707b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C9067a f85708c;

    static final class a extends AbstractC7737t implements Function1<MBlockFileBinding, Unit> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ c f85710c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ p f85711d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ru.ozon.android.messenger.framework.presentation.models.d f85712e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Object f85713f;

        /* renamed from: ru.ozon.android.messenger.blocks.messagefile.e$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C1509a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f85714a;

            static {
                int[] iArr = new int[i.a.values().length];
                try {
                    iArr[i.a.STATUS_CHANGED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                f85714a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(c cVar, p pVar, ru.ozon.android.messenger.framework.presentation.models.d dVar, Object obj) {
            super(1);
            this.f85710c = cVar;
            this.f85711d = pVar;
            this.f85712e = dVar;
            this.f85713f = obj;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(MBlockFileBinding mBlockFileBinding) {
            MBlockFileBinding withBinding = mBlockFileBinding;
            Intrinsics.checkNotNullParameter(withBinding, "$this$withBinding");
            e eVar = e.this;
            c cVar = this.f85710c;
            p pVar = this.f85711d;
            ru.ozon.android.messenger.framework.presentation.models.d dVar = this.f85712e;
            Object obj = this.f85713f;
            e.super.bind(cVar, pVar, dVar, obj);
            if (!(pVar instanceof s)) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (cVar.d()) {
                e.c(eVar, cVar);
            }
            if (obj != null) {
                List list = obj instanceof List ? (List) obj : null;
                if (list == null || list.isEmpty()) {
                    list = C7705l.f0(i.a.values());
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (C1509a.f85714a[((i.a) ((Enum) it.next())).ordinal()] != 1) {
                        throw new o();
                    }
                    e.e(eVar, withBinding, cVar, (s) pVar);
                }
            } else {
                e.e(eVar, withBinding, cVar, (s) pVar);
                String a11 = cVar.a();
                AppCompatTextView authorNameTv = withBinding.authorNameTv;
                Intrinsics.checkNotNullExpressionValue(authorNameTv, "authorNameTv");
                n.e(authorNameTv, a11);
                withBinding.fileNameTv.setTextAppearance(UniTextStyles.COMPACT_500_MEDIUM.getResId());
                AppCompatTextView fileNameTv = withBinding.fileNameTv;
                Intrinsics.checkNotNullExpressionValue(fileNameTv, "fileNameTv");
                fileNameTv.setText(h.X(cVar.g(), " ", " ", false));
                fileNameTv.setMaxLines(1);
                G.a(fileNameTv, new f(fileNameTv, fileNameTv));
                withBinding.fileSizeTv.setText(cVar.h());
                ConstraintLayout fileMessageRootCl = withBinding.fileMessageRootCl;
                Intrinsics.checkNotNullExpressionValue(fileMessageRootCl, "fileMessageRootCl");
                ru.ozon.android.messenger.utils.view.s.c(fileMessageRootCl, new d(pVar, withBinding, eVar, cVar));
                if (cVar.getSendTime() != null) {
                    ConstraintLayout fileMessageRootCl2 = withBinding.fileMessageRootCl;
                    Intrinsics.checkNotNullExpressionValue(fileMessageRootCl2, "fileMessageRootCl");
                    eVar.makeViewInMultipleFilledWidth(fileMessageRootCl2);
                }
            }
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(@NotNull MBlockFileBinding binding, @NotNull ru.ozon.android.messenger.framework.core.d references, @NotNull E okHttpClient, @NotNull C9067a networkInfoProvider) {
        super(binding, references);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        Intrinsics.checkNotNullParameter(networkInfoProvider, "networkInfoProvider");
        this.f85706a = references;
        this.f85707b = okHttpClient;
        this.f85708c = networkInfoProvider;
    }

    public static final void c(e eVar, c cVar) {
        NetworkInfo h11;
        h11 = eVar.f85708c.h(C9070d.f82206b);
        boolean z11 = h11 instanceof NetworkInfo.Available;
        ru.ozon.android.messenger.framework.core.d dVar = eVar.f85706a;
        if (!z11) {
            View view = dVar.d().getView();
            ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
            if (viewGroup != null) {
                Context context = viewGroup.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                new g.a(context).a(CoordinatorLayoutManagerKt.asNotificationLayoutManager$default(viewGroup, null, 1, null), dVar.f());
                return;
            }
            return;
        }
        try {
            d.a f7 = ru.ozon.android.messenger.utils.g.f(dVar.d());
            a.C1723a c1723a = new a.C1723a(eVar.getContext(), eVar.f85707b, dVar);
            c1723a.b(cVar.g(), ru.ozon.android.messenger.utils.n.b(cVar.i(), f7.a(), f7.b()), cVar.f(), cVar.getBlockId().a());
            c1723a.a().d(dVar.d(), cVar.getBlockId().toString());
        } catch (Exception e11) {
            String g10 = cVar.g();
            Lm0.a.f17149a.w("Unable to download file with name " + g10 + "! Reason: " + e11, new Object[0]);
            if (e11 instanceof SecurityException) {
                dVar.c().c(new d.b(R$string.messenger_error_unable_to_download_file));
            }
        }
    }

    public static final void e(e eVar, MBlockFileBinding mBlockFileBinding, c cVar, s sVar) {
        eVar.getClass();
        String sendTime = cVar.getSendTime();
        if (sendTime == null) {
            sendTime = "";
        }
        ru.ozon.android.messenger.framework.presentation.common.view.timestatus.d dVar = new ru.ozon.android.messenger.framework.presentation.common.view.timestatus.d(sendTime, sVar.k(), sVar.n());
        TimeStatusView timeStatusView = mBlockFileBinding.timeStatusView;
        Intrinsics.checkNotNullExpressionValue(timeStatusView, "timeStatusView");
        dVar.a(timeStatusView);
    }

    @Override // ru.ozon.android.messenger.framework.presentation.common.view.recycler.q
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final void bind(@NotNull c block, @NotNull p itemInfo, @NotNull ru.ozon.android.messenger.framework.presentation.models.d blockInfo, Object obj) {
        Intrinsics.checkNotNullParameter(block, "block");
        Intrinsics.checkNotNullParameter(itemInfo, "itemInfo");
        Intrinsics.checkNotNullParameter(blockInfo, "blockInfo");
        withBinding(new a(block, itemInfo, blockInfo, obj));
    }
}
