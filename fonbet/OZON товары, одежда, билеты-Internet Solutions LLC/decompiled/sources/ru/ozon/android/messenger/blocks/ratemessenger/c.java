package ru.ozon.android.messenger.blocks.ratemessenger;

import Sc.o;
import android.text.Editable;
import android.text.InputFilter;
import android.view.View;
import android.widget.LinearLayout;
import androidx.lifecycle.K;
import androidx.recyclerview.widget.C;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7705l;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.blocks.ratemessenger.i;
import ru.ozon.android.messenger.framework.navigation.action.d;
import ru.ozon.android.messenger.framework.navigation.action.g;
import ru.ozon.android.messenger.framework.presentation.common.keyboard.b;
import ru.ozon.android.messenger.framework.presentation.common.view.recycler.q;
import ru.ozon.android.messenger.framework.presentation.models.p;
import ru.ozon.android.messenger.utils.view.s;
import ru.ozon.app.android.messenger.R$string;
import ru.ozon.app.android.messenger.databinding.MRateMessengerBlockBinding;
import ru.ozon.uni.android.atom.labelRating.LabelRatingView;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.rating.RatingDTO;

/* loaded from: classes10.dex */
public final class c extends q<ru.ozon.android.messenger.blocks.ratemessenger.b, MRateMessengerBlockBinding> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.core.d f86099a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.blocks.ratemessenger.recycler.adapter.a f86100b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final LinkedHashMap f86101c;

    /* renamed from: d, reason: collision with root package name */
    private final int f86102d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f86103e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f86104f;

    static final class a extends AbstractC7737t implements Function1<MRateMessengerBlockBinding, Unit> {
        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(MRateMessengerBlockBinding mRateMessengerBlockBinding) {
            MRateMessengerBlockBinding withBinding = mRateMessengerBlockBinding;
            Intrinsics.checkNotNullParameter(withBinding, "$this$withBinding");
            c.q(c.this, withBinding);
            withBinding.messageTextInputLayout.b0(null);
            withBinding.messageTextInputLayout.O(0);
            withBinding.messageTextInputLayout.P(0);
            return Unit.f71690a;
        }
    }

    static final class b extends AbstractC7737t implements Function1<MRateMessengerBlockBinding, Unit> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ru.ozon.android.messenger.blocks.ratemessenger.b f86107c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ p f86108d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ru.ozon.android.messenger.framework.presentation.models.d f86109e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Object f86110f;

        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f86111a;

            static {
                int[] iArr = new int[i.b.values().length];
                try {
                    iArr[i.b.TITLE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[i.b.DESCRIPTION.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[i.b.RATES.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[i.b.MESSAGE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                f86111a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(ru.ozon.android.messenger.blocks.ratemessenger.b bVar, p pVar, ru.ozon.android.messenger.framework.presentation.models.d dVar, Object obj) {
            super(1);
            this.f86107c = bVar;
            this.f86108d = pVar;
            this.f86109e = dVar;
            this.f86110f = obj;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(MRateMessengerBlockBinding mRateMessengerBlockBinding) {
            MRateMessengerBlockBinding withBinding = mRateMessengerBlockBinding;
            Intrinsics.checkNotNullParameter(withBinding, "$this$withBinding");
            c cVar = c.this;
            ru.ozon.android.messenger.blocks.ratemessenger.b bVar = this.f86107c;
            p pVar = this.f86108d;
            ru.ozon.android.messenger.framework.presentation.models.d dVar = this.f86109e;
            Object obj = this.f86110f;
            c.super.bind(bVar, pVar, dVar, obj);
            TextInputEditText messageEditText = cVar.getBinding().messageEditText;
            Intrinsics.checkNotNullExpressionValue(messageEditText, "messageEditText");
            new b.a(messageEditText, K.a(cVar.f86099a.f())).a(bVar.d(), ru.ozon.android.messenger.framework.presentation.common.keyboard.c.f90773b, ru.ozon.android.messenger.framework.presentation.common.keyboard.d.f90774b);
            List list = obj instanceof List ? (List) obj : null;
            if (list == null || list.isEmpty()) {
                list = C7705l.f0(i.b.values());
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int i11 = a.f86111a[((i.b) ((Enum) it.next())).ordinal()];
                if (i11 == 1) {
                    withBinding.titleTextAtom.setText(bVar.h());
                } else if (i11 == 2) {
                    withBinding.descriptionTextAtom.setText(bVar.c());
                } else if (i11 == 3) {
                    LabelRatingView labelRatingView = withBinding.ratingBar;
                    labelRatingView.getMainView().setRatingSize(RatingDTO.RatingSize.SIZE_700);
                    labelRatingView.getMainView().setOnLongClickListener(null);
                    ru.ozon.android.messenger.utils.view.j.a(labelRatingView, new g(cVar, withBinding, bVar));
                } else {
                    if (i11 != 4) {
                        throw new o();
                    }
                    ru.ozon.android.messenger.blocks.ratemessenger.a e11 = bVar.e();
                    if (e11 != null) {
                        withBinding.messageTextInputLayout.d0(e11.b());
                        Integer a11 = e11.a();
                        if (a11 != null) {
                            int intValue = a11.intValue();
                            withBinding.messageEditText.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(intValue + 1)});
                            withBinding.messageEditText.addTextChangedListener(new h(cVar, intValue));
                        }
                    }
                }
                c.o(cVar, bVar.b());
            }
            return Unit.f71690a;
        }
    }

    /* renamed from: ru.ozon.android.messenger.blocks.ratemessenger.c$c, reason: collision with other inner class name */
    static final class C1517c extends AbstractC7737t implements Function1<MRateMessengerBlockBinding, Unit> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ButtonV3Atom.LargeButton f86113c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1517c(ButtonV3Atom.LargeButton largeButton) {
            super(1);
            this.f86113c = largeButton;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(MRateMessengerBlockBinding mRateMessengerBlockBinding) {
            MRateMessengerBlockBinding withBinding = mRateMessengerBlockBinding;
            Intrinsics.checkNotNullParameter(withBinding, "$this$withBinding");
            c cVar = c.this;
            ru.ozon.android.messenger.framework.presentation.chatlist.popup.d a11 = ru.ozon.android.messenger.framework.presentation.chatlist.popup.e.a(cVar.f86099a);
            if (a11 != null && !a11.c()) {
                ButtonV3Atom.LargeButton largeButton = this.f86113c;
                a11.k(largeButton, c.l(cVar, largeButton.getAction(), ru.ozon.android.messenger.framework.navigation.action.g.SEND_RATE_MESSENGER), new ru.ozon.android.messenger.blocks.ratemessenger.d(cVar, withBinding));
            }
            return Unit.f71690a;
        }
    }

    static final class d extends AbstractC7737t implements Function1<MRateMessengerBlockBinding, Unit> {
        d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(MRateMessengerBlockBinding mRateMessengerBlockBinding) {
            MRateMessengerBlockBinding withBinding = mRateMessengerBlockBinding;
            Intrinsics.checkNotNullParameter(withBinding, "$this$withBinding");
            ru.ozon.android.messenger.framework.presentation.chatlist.popup.d a11 = ru.ozon.android.messenger.framework.presentation.chatlist.popup.e.a(c.this.f86099a);
            if (a11 != null) {
                a11.j();
            }
            TextInputLayout messageTextInputLayout = withBinding.messageTextInputLayout;
            Intrinsics.checkNotNullExpressionValue(messageTextInputLayout, "messageTextInputLayout");
            Intrinsics.checkNotNullParameter(messageTextInputLayout, "<this>");
            messageTextInputLayout.Z(null);
            messageTextInputLayout.a0(false);
            withBinding.messageTextInputLayout.O(0);
            withBinding.messageTextInputLayout.P(0);
            return Unit.f71690a;
        }
    }

    /* synthetic */ class e extends C7735q implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            c.k((c) this.receiver);
            return Unit.f71690a;
        }
    }

    static final class f extends AbstractC7737t implements Function1<MRateMessengerBlockBinding, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f86115b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ c f86116c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str, c cVar) {
            super(1);
            this.f86115b = str;
            this.f86116c = cVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(MRateMessengerBlockBinding mRateMessengerBlockBinding) {
            MRateMessengerBlockBinding withBinding = mRateMessengerBlockBinding;
            Intrinsics.checkNotNullParameter(withBinding, "$this$withBinding");
            if (!withBinding.messageTextInputLayout.D()) {
                TextInputLayout messageTextInputLayout = withBinding.messageTextInputLayout;
                Intrinsics.checkNotNullExpressionValue(messageTextInputLayout, "messageTextInputLayout");
                Intrinsics.checkNotNullParameter(messageTextInputLayout, "<this>");
                String errorText = this.f86115b;
                Intrinsics.checkNotNullParameter(errorText, "errorText");
                messageTextInputLayout.Z(errorText);
                messageTextInputLayout.a0(true);
                c cVar = this.f86116c;
                ru.ozon.android.messenger.framework.presentation.chatlist.popup.d a11 = ru.ozon.android.messenger.framework.presentation.chatlist.popup.e.a(cVar.f86099a);
                if (a11 != null) {
                    a11.m();
                }
                withBinding.messageTextInputLayout.O(cVar.f86102d);
                withBinding.messageTextInputLayout.P(cVar.f86102d);
            }
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(@NotNull MRateMessengerBlockBinding binding, @NotNull ru.ozon.android.messenger.framework.core.d references) {
        super(binding, references);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(references, "references");
        this.f86099a = references;
        this.f86100b = new ru.ozon.android.messenger.blocks.ratemessenger.recycler.adapter.a(ru.ozon.android.messenger.utils.g.f(references.d()), new e(0, this, c.class, "notifySelectedReasonsUpdated", "notifySelectedReasonsUpdated()V", 0));
        this.f86101c = new LinkedHashMap();
        this.f86102d = binding.messageTextInputLayout.p();
        this.f86104f = true;
        withBinding(new a());
    }

    public static final void k(c cVar) {
        cVar.getBinding().messageEditText.clearFocus();
        ArrayList g10 = cVar.f86100b.g();
        boolean z11 = false;
        if (!g10.isEmpty()) {
            Iterator it = g10.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((k) it.next()).c()) {
                    z11 = true;
                    break;
                }
            }
        }
        Editable text = cVar.getBinding().messageEditText.getText();
        if ((text == null || kotlin.text.h.K(text)) && z11) {
            cVar.v(ru.ozon.android.messenger.utils.c.d(R$string.messenger_fill_in_field, cVar.getContext()));
        } else {
            if (!Intrinsics.d(cVar.getBinding().messageTextInputLayout.v(), ru.ozon.android.messenger.utils.c.d(R$string.messenger_exceeded_number_of_characters, cVar.getContext()))) {
                cVar.u();
            }
        }
        LinkedHashMap linkedHashMap = cVar.f86101c;
        String a11 = d.c.REASONS.a();
        ArrayList arrayList = new ArrayList(C7714v.z(g10, 10));
        Iterator it2 = g10.iterator();
        while (it2.hasNext()) {
            arrayList.add(((k) it2.next()).b());
        }
        linkedHashMap.put(a11, arrayList);
    }

    public static final ru.ozon.android.messenger.framework.navigation.action.a l(c cVar, AtomActionDTO atomActionDTO, ru.ozon.android.messenger.framework.navigation.action.g gVar) {
        AtomActionDTO atomActionDTO2;
        if (atomActionDTO != null) {
            cVar.getClass();
            atomActionDTO2 = AtomActionDTO.copy$default(atomActionDTO, null, null, gVar.a(), null, null, 27, null);
        } else {
            atomActionDTO2 = null;
        }
        return ru.ozon.android.messenger.framework.navigation.action.b.d(atomActionDTO2, cVar.f86101c);
    }

    public static final void o(c cVar, AtomActionDTO atomActionDTO) {
        cVar.f86099a.c().q(ru.ozon.android.messenger.framework.navigation.action.b.d(ru.ozon.android.messenger.utils.a.a(ru.ozon.android.messenger.framework.navigation.action.g.SET_ON_HIDE_CALLBACK), U.i(new Pair(g.b.ON_HIDE_ACTION.a(), ru.ozon.android.messenger.framework.navigation.action.b.d(atomActionDTO != null ? AtomActionDTO.copy$default(atomActionDTO, null, null, ru.ozon.android.messenger.framework.navigation.action.g.SEND_RATE_MESSENGER_ON_DISMISS.a(), null, null, 27, null) : null, cVar.f86101c)))));
    }

    public static final void p(c cVar, j jVar) {
        cVar.getBinding().rateQuestionTextAtom.setText(jVar.c());
        List<k> b11 = jVar.b();
        boolean z11 = b11 == null || b11.isEmpty();
        boolean z12 = !z11;
        LinearLayout contentLl = cVar.getBinding().contentLl;
        Intrinsics.checkNotNullExpressionValue(contentLl, "contentLl");
        int childCount = contentLl.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = contentLl.getChildAt(i11);
            if (childAt instanceof RecyclerView) {
                s.e(childAt, Boolean.valueOf(z12));
            } else {
                s.d(childAt);
            }
        }
        if (z11) {
            return;
        }
        cVar.f86100b.submitList(b11);
        cVar.getBinding().reasonsRecyclerView.scrollToPosition(0);
    }

    public static final void q(c cVar, MRateMessengerBlockBinding mRateMessengerBlockBinding) {
        cVar.getClass();
        RecyclerView recyclerView = mRateMessengerBlockBinding.reasonsRecyclerView;
        recyclerView.addItemDecoration(new ru.ozon.android.messenger.blocks.ratemessenger.recycler.decoration.a());
        recyclerView.setAdapter(cVar.f86100b);
        RecyclerView.l itemAnimator = recyclerView.getItemAnimator();
        C c11 = itemAnimator instanceof C ? (C) itemAnimator : null;
        if (c11 != null) {
            c11.setSupportsChangeAnimations(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t(ButtonV3Atom.LargeButton largeButton) {
        withBinding(new C1517c(largeButton));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u() {
        withBinding(new d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v(String str) {
        withBinding(new f(str, this));
    }

    @Override // ru.ozon.android.messenger.framework.presentation.common.view.recycler.q
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public final void bind(@NotNull ru.ozon.android.messenger.blocks.ratemessenger.b block, @NotNull p itemInfo, @NotNull ru.ozon.android.messenger.framework.presentation.models.d blockInfo, Object obj) {
        Intrinsics.checkNotNullParameter(block, "block");
        Intrinsics.checkNotNullParameter(itemInfo, "itemInfo");
        Intrinsics.checkNotNullParameter(blockInfo, "blockInfo");
        withBinding(new b(block, itemInfo, blockInfo, obj));
    }
}
