package ru.ozon.app.android.fresh.feature.b2b.widgets.docsTable.presentation;

import Vg.c;
import android.os.Build;
import android.os.Bundle;
import android.widget.LinearLayout;
import androidx.fragment.app.C5402x;
import androidx.fragment.app.ComponentCallbacksC5392m;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.fresh.feature.b2b.databinding.WidgetDocsTableBinding;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B#\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\u0010\t\u001a\u00060\u0007j\u0002`\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0012R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0013R\u0018\u0010\t\u001a\u00060\u0007j\u0002`\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0014R \u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u000f0\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/docsTable/presentation/DocsTableViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/docsTable/presentation/DocsTableVO;", "Lru/ozon/app/android/fresh/feature/b2b/databinding/WidgetDocsTableBinding;", "binding", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "LVg/c;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStore;", "customActionHandlersStore", "<init>", "(Lru/ozon/app/android/fresh/feature/b2b/databinding/WidgetDocsTableBinding;Lru/ozon/app/android/composer/ComposerReferences;LVg/c;)V", "item", "Ll20/d;", "info", "", "bind", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/docsTable/presentation/DocsTableVO;Ll20/d;)V", "Lru/ozon/app/android/fresh/feature/b2b/databinding/WidgetDocsTableBinding;", "Lru/ozon/app/android/composer/ComposerReferences;", "LVg/c;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/docsTable/presentation/DocsTablePeriodsAdapter;", "docsTablePeriodsAdapter", "Lru/ozon/app/android/fresh/feature/b2b/widgets/docsTable/presentation/DocsTablePeriodsAdapter;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DocsTableViewHolder extends k<DocsTableVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final WidgetDocsTableBinding binding;

    @NotNull
    private final c customActionHandlersStore;

    @NotNull
    private final DocsTablePeriodsAdapter docsTablePeriodsAdapter;

    @NotNull
    private final ComposerReferences references;

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "<unused var>", "", "bundle", "Landroid/os/Bundle;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.fresh.feature.b2b.widgets.docsTable.presentation.DocsTableViewHolder$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function2<String, Bundle, Unit> {
        AnonymousClass1() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(String str, Bundle bundle) {
            invoke2(str, bundle);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(String str, Bundle bundle) {
            Object obj;
            Intrinsics.checkNotNullParameter(str, "<unused var>");
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            if (Build.VERSION.SDK_INT >= 33) {
                obj = bundle.getSerializable("b2b_accept_act_key_refresh_flag", Boolean.class);
            } else {
                Object serializable = bundle.getSerializable("b2b_accept_act_key_refresh_flag");
                if (!(serializable instanceof Boolean)) {
                    serializable = null;
                }
                obj = (Boolean) serializable;
            }
            if (Intrinsics.d((Boolean) obj, Boolean.TRUE)) {
                InterfaceC7851b.a.a(DocsTableViewHolder.this.references.getController(), null, null, null, null, 15);
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DocsTableViewHolder(@NotNull WidgetDocsTableBinding binding, @NotNull ComposerReferences references, @NotNull c customActionHandlersStore) {
        super(r0);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(customActionHandlersStore, "customActionHandlersStore");
        LinearLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
        this.references = references;
        this.customActionHandlersStore = customActionHandlersStore;
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(references, this).customActionHandlers(new DocsTableViewHolder$actionHandler$1(this)).buildHandler();
        this.actionHandler = buildHandler;
        DocsTablePeriodsAdapter docsTablePeriodsAdapter = new DocsTablePeriodsAdapter(buildHandler);
        this.docsTablePeriodsAdapter = docsTablePeriodsAdapter;
        binding.recyclerView.setAdapter(docsTablePeriodsAdapter);
        ComponentCallbacksC5392m c11 = references.getContainer().c();
        if (c11 != null) {
            C5402x.b(c11, "b2b_accept_act_request_key_refresh", new AnonymousClass1());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull DocsTableVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        TextAtomV2View listTitle = this.binding.listTitle;
        Intrinsics.checkNotNullExpressionValue(listTitle, "listTitle");
        TextHolderKt.bindOrGone$default(listTitle, item.getListTitle(), null, 2, null);
        this.docsTablePeriodsAdapter.submitList(item.getPeriods());
    }
}
