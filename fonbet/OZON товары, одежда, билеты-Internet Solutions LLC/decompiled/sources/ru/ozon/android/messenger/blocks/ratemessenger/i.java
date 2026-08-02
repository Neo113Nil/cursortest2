package ru.ozon.android.messenger.blocks.ratemessenger;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import fd.InterfaceC6511n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.android.messenger.framework.core.viewmapper.a;
import ru.ozon.android.messenger.framework.navigation.controller.d;
import ru.ozon.android.messenger.framework.presentation.common.keyboard.b;
import ru.ozon.android.messenger.framework.presentation.common.view.recycler.q;
import ru.ozon.app.android.messenger.databinding.MRateMessengerBlockBinding;
import ru.ozon.app.android.ugc.core.widgets.selectionItemDescription.data.SelectionItemDescriptionDTO;

/* loaded from: classes10.dex */
public final class i extends ru.ozon.android.messenger.framework.core.viewmapper.a<RateMessengerDTO, ru.ozon.android.messenger.blocks.ratemessenger.b, MRateMessengerBlockBinding> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final JsonParser f86126a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC6511n<LayoutInflater, ViewGroup, Boolean, MRateMessengerBlockBinding> f86127b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Function2<MRateMessengerBlockBinding, ru.ozon.android.messenger.framework.core.d, q<ru.ozon.android.messenger.blocks.ratemessenger.b, MRateMessengerBlockBinding>> f86128c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final a.AbstractC1563a.C1564a f86129d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final Function1<String, RateMessengerDTO> f86130e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final Function2<RateMessengerDTO, ru.ozon.android.messenger.framework.presentation.models.c, List<ru.ozon.android.messenger.blocks.ratemessenger.b>> f86131f;

    public static final class a implements d.w.a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final b.c f86132a;

        public a(@NotNull b.c keyboardState) {
            Intrinsics.checkNotNullParameter(keyboardState, "keyboardState");
            this.f86132a = keyboardState;
        }

        @NotNull
        public final b.c a() {
            return this.f86132a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.d(this.f86132a, ((a) obj).f86132a);
        }

        public final int hashCode() {
            return this.f86132a.hashCode();
        }

        @NotNull
        public final String toString() {
            return "InputFocus(keyboardState=" + this.f86132a + ")";
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ b[] $VALUES;
        public static final b DESCRIPTION;
        public static final b MESSAGE;
        public static final b RATES;
        public static final b TITLE;

        static {
            b bVar = new b(SelectionItemDescriptionDTO.TITLE, 0);
            TITLE = bVar;
            b bVar2 = new b("DESCRIPTION", 1);
            DESCRIPTION = bVar2;
            b bVar3 = new b("RATES", 2);
            RATES = bVar3;
            b bVar4 = new b("MESSAGE", 3);
            MESSAGE = bVar4;
            b[] bVarArr = {bVar, bVar2, bVar3, bVar4};
            $VALUES = bVarArr;
            $ENTRIES = Xc.b.a(bVarArr);
        }

        private b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }
    }

    /* synthetic */ class c extends C7735q implements InterfaceC6511n<LayoutInflater, ViewGroup, Boolean, MRateMessengerBlockBinding> {

        /* renamed from: a, reason: collision with root package name */
        public static final c f86133a = new c(3, MRateMessengerBlockBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lru/ozon/app/android/messenger/databinding/MRateMessengerBlockBinding;", 0);

        @Override // fd.InterfaceC6511n
        public final MRateMessengerBlockBinding invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            LayoutInflater p02 = layoutInflater;
            boolean booleanValue = bool.booleanValue();
            Intrinsics.checkNotNullParameter(p02, "p0");
            return MRateMessengerBlockBinding.inflate(p02, viewGroup, booleanValue);
        }
    }

    static final class d extends AbstractC7737t implements Function2<RateMessengerDTO, ru.ozon.android.messenger.framework.presentation.models.c, List<? extends ru.ozon.android.messenger.blocks.ratemessenger.b>> {

        /* renamed from: b, reason: collision with root package name */
        public static final d f86134b = new d(2);

        @Override // kotlin.jvm.functions.Function2
        public final List<? extends ru.ozon.android.messenger.blocks.ratemessenger.b> invoke(RateMessengerDTO rateMessengerDTO, ru.ozon.android.messenger.framework.presentation.models.c cVar) {
            RateMessengerDTO state = rateMessengerDTO;
            ru.ozon.android.messenger.framework.presentation.models.c blockId = cVar;
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(blockId, "blockId");
            String title = state.getTitle();
            String description = state.getDescription();
            List<RateDTO> rates = state.getRates();
            ArrayList arrayList = new ArrayList(C7714v.z(rates, 10));
            Iterator<T> it = rates.iterator();
            while (true) {
                ArrayList arrayList2 = null;
                if (!it.hasNext()) {
                    break;
                }
                RateDTO rateDTO = (RateDTO) it.next();
                Intrinsics.checkNotNullParameter(rateDTO, "<this>");
                int rate = rateDTO.getRate();
                String text = rateDTO.getText();
                List<ReasonDTO> reasons = rateDTO.getReasons();
                if (reasons != null) {
                    List<ReasonDTO> list = reasons;
                    arrayList2 = new ArrayList(C7714v.z(list, 10));
                    for (ReasonDTO reasonDTO : list) {
                        Intrinsics.checkNotNullParameter(reasonDTO, "<this>");
                        String text2 = reasonDTO.getText();
                        String imageUrl = reasonDTO.getImageUrl();
                        Boolean isMessageRequired = reasonDTO.isMessageRequired();
                        arrayList2.add(new k(text2, imageUrl, isMessageRequired != null ? isMessageRequired.booleanValue() : false));
                    }
                }
                arrayList.add(new j(rate, text, arrayList2));
            }
            MessageDTO message = state.getMessage();
            return C7714v.a0(new ru.ozon.android.messenger.blocks.ratemessenger.b(blockId, title, description, arrayList, new ru.ozon.android.messenger.blocks.ratemessenger.a(message != null ? message.getPlaceholder() : null, message != null ? message.getMaxCharacters() : null), state.getSendButton(), state.getCancelAction(), b.c.a.f90771a, state.getTrackingInfo()));
        }
    }

    static final class e extends AbstractC7737t implements Function1<String, RateMessengerDTO> {
        e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final RateMessengerDTO invoke(String str) {
            String it = str;
            Intrinsics.checkNotNullParameter(it, "it");
            return (RateMessengerDTO) i.this.f86126a.fromJson(it, RateMessengerDTO.class);
        }
    }

    static final class f extends AbstractC7737t implements Function2<d.w.a, ru.ozon.android.messenger.blocks.ratemessenger.b, ru.ozon.android.messenger.blocks.ratemessenger.b> {

        /* renamed from: b, reason: collision with root package name */
        public static final f f86136b = new f(2);

        @Override // kotlin.jvm.functions.Function2
        public final ru.ozon.android.messenger.blocks.ratemessenger.b invoke(d.w.a aVar, ru.ozon.android.messenger.blocks.ratemessenger.b bVar) {
            d.w.a updateKey = aVar;
            ru.ozon.android.messenger.blocks.ratemessenger.b rateMessengerVO = bVar;
            Intrinsics.checkNotNullParameter(updateKey, "updateKey");
            Intrinsics.checkNotNullParameter(rateMessengerVO, "rateMessengerVO");
            if (updateKey instanceof a) {
                return ru.ozon.android.messenger.blocks.ratemessenger.b.a(rateMessengerVO, ((a) updateKey).a());
            }
            return null;
        }
    }

    /* synthetic */ class g extends C7735q implements Function2<MRateMessengerBlockBinding, ru.ozon.android.messenger.framework.core.d, ru.ozon.android.messenger.blocks.ratemessenger.c> {

        /* renamed from: a, reason: collision with root package name */
        public static final g f86137a = new g(2, ru.ozon.android.messenger.blocks.ratemessenger.c.class, "<init>", "<init>(Lru/ozon/app/android/messenger/databinding/MRateMessengerBlockBinding;Lru/ozon/android/messenger/framework/core/References;)V", 0);

        @Override // kotlin.jvm.functions.Function2
        public final ru.ozon.android.messenger.blocks.ratemessenger.c invoke(MRateMessengerBlockBinding mRateMessengerBlockBinding, ru.ozon.android.messenger.framework.core.d dVar) {
            MRateMessengerBlockBinding p02 = mRateMessengerBlockBinding;
            ru.ozon.android.messenger.framework.core.d p12 = dVar;
            Intrinsics.checkNotNullParameter(p02, "p0");
            Intrinsics.checkNotNullParameter(p12, "p1");
            return new ru.ozon.android.messenger.blocks.ratemessenger.c(p02, p12);
        }
    }

    public i(@NotNull JsonParser jsonDeserializer) {
        Intrinsics.checkNotNullParameter(jsonDeserializer, "jsonDeserializer");
        this.f86126a = jsonDeserializer;
        this.f86127b = c.f86133a;
        this.f86128c = g.f86137a;
        this.f86129d = a.AbstractC1563a.C1564a.f87356a;
        this.f86130e = new e();
        this.f86131f = d.f86134b;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.a
    @NotNull
    public final a.AbstractC1563a getBlockContainerSettings() {
        return this.f86129d;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.a
    @NotNull
    public final InterfaceC6511n<LayoutInflater, ViewGroup, Boolean, MRateMessengerBlockBinding> getInflate() {
        return this.f86127b;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.d
    @NotNull
    public final Function2<RateMessengerDTO, ru.ozon.android.messenger.framework.presentation.models.c, List<ru.ozon.android.messenger.blocks.ratemessenger.b>> getMapper() {
        return this.f86131f;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.d
    @NotNull
    public final Function1<String, RateMessengerDTO> getParser() {
        return this.f86130e;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.a
    public final List getPayloads(ru.ozon.android.messenger.blocks.ratemessenger.b bVar, ru.ozon.android.messenger.blocks.ratemessenger.b bVar2) {
        ru.ozon.android.messenger.blocks.ratemessenger.b oldItem = bVar;
        ru.ozon.android.messenger.blocks.ratemessenger.b newItem = bVar2;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        ArrayList arrayList = new ArrayList();
        if (!Intrinsics.d(oldItem.h(), newItem.h())) {
            arrayList.add(b.TITLE);
            return arrayList;
        }
        if (!Intrinsics.d(oldItem.c(), newItem.c())) {
            arrayList.add(b.DESCRIPTION);
            return arrayList;
        }
        if (!oldItem.f().equals(newItem.f())) {
            arrayList.add(b.RATES);
            return arrayList;
        }
        if (!Intrinsics.d(oldItem.e(), newItem.e())) {
            arrayList.add(b.MESSAGE);
        }
        return arrayList;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.d
    @NotNull
    public final List<Class<? extends d.w.a>> getSupportedUpdateKeys() {
        return C7714v.a0(a.class);
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.d
    @NotNull
    public final Function2<d.w.a, ru.ozon.android.messenger.blocks.ratemessenger.b, ru.ozon.android.messenger.blocks.ratemessenger.b> getUpdateConsumer() {
        return f.f86136b;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.a
    @NotNull
    public final Function2<MRateMessengerBlockBinding, ru.ozon.android.messenger.framework.core.d, q<ru.ozon.android.messenger.blocks.ratemessenger.b, MRateMessengerBlockBinding>> getViewProducer() {
        return this.f86128c;
    }
}
