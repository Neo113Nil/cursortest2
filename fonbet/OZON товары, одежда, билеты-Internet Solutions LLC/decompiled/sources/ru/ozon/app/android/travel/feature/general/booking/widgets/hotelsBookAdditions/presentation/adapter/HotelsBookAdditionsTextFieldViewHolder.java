package ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookAdditions.presentation.adapter;

import UZ.d;
import WZ.e;
import WZ.g;
import WZ.h;
import WZ.l;
import WZ.t;
import android.view.View;
import fd.InterfaceC6511n;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookAdditions.presentation.HotelsBookAdditionsVO;
import ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookAdditions.presentation.adapter.HotelsBookAdditionsFieldsAdapter;
import ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookAdditions.presentation.adapter.HotelsBookAdditionsTextFieldViewHolder;
import ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookAdditions.view.HotelsBookAdditionsTextFieldView;
import ru.ozon.app.android.travel.molecules.extensions.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.travel.molecules.input.v1.CommonInputVO;
import ru.ozon.app.android.travel.molecules.input.v1.InputPayload;
import ru.ozon.app.android.travel.utils.DebouncedTextWatcher;
import ru.ozon.app.android.uikit.view.recycler.adapter.BaseViewHolder;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 &2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001&B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00022\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J%\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00022\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00130\bH\u0016¢\u0006\u0004\b\u0014\u0010\fJ7\u0010\u001b\u001a\u00020\n2 \u0010\u0018\u001a\u001c\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0017\u0012\u0004\u0012\u00020\n0\u00152\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\n¢\u0006\u0004\b\u001d\u0010\u001eR\u0016\u0010 \u001a\u0004\u0018\u00010\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010\"\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R2\u0010\u0018\u001a\u001e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0017\u0012\u0004\u0012\u00020\n\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010$R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010%¨\u0006'"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookAdditions/presentation/adapter/HotelsBookAdditionsTextFieldViewHolder;", "Lru/ozon/app/android/uikit/view/recycler/adapter/BaseViewHolder;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookAdditions/presentation/HotelsBookAdditionsVO$FieldVO;", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "item", "", "payloads", "", "bindWithPayloads", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookAdditions/presentation/HotelsBookAdditionsVO$FieldVO;Ljava/util/List;)V", "", "count", "length", "", "processTextCounter", "(II)Ljava/lang/String;", "", "bind", "Lkotlin/Function3;", "", "", "onTextInputChanged", "LWZ/l;", "tokenizedAnalytics", "setupCallbacks", "(Lfd/n;LWZ/l;)V", "removeCallbacks", "()V", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookAdditions/view/HotelsBookAdditionsTextFieldView;", "fieldView", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookAdditions/view/HotelsBookAdditionsTextFieldView;", "boundedData", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookAdditions/presentation/HotelsBookAdditionsVO$FieldVO;", "Lfd/n;", "LWZ/l;", "Companion", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HotelsBookAdditionsTextFieldViewHolder extends BaseViewHolder<HotelsBookAdditionsVO.FieldVO> {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private HotelsBookAdditionsVO.FieldVO boundedData;
    private final HotelsBookAdditionsTextFieldView fieldView;
    private InterfaceC6511n<? super Long, ? super String, ? super CharSequence, Unit> onTextInputChanged;
    private l tokenizedAnalytics;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "hasFocus", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookAdditions.presentation.adapter.HotelsBookAdditionsTextFieldViewHolder$4, reason: invalid class name */
    static final class AnonymousClass4 extends AbstractC7737t implements Function1<Boolean, Unit> {
        AnonymousClass4() {
            super(1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final g invoke$lambda$3$lambda$2(int i11, UZ.a aVar, g params) {
            Intrinsics.checkNotNullParameter(aVar, "<unused var>");
            Intrinsics.checkNotNullParameter(params, "params");
            LinkedHashMap a11 = h.a(params.b());
            a11.put("number", Integer.valueOf(i11));
            return g.a(params, a11, null, 2);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.f71690a;
        }

        public final void invoke(boolean z11) {
            l lVar;
            l lVar2;
            HotelsBookAdditionsVO.FieldVO fieldVO = HotelsBookAdditionsTextFieldViewHolder.this.boundedData;
            CommonInputVO input = fieldVO != null ? fieldVO.getInput() : null;
            CommonInputVO.TextCommonInputVO textCommonInputVO = input instanceof CommonInputVO.TextCommonInputVO ? (CommonInputVO.TextCommonInputVO) input : null;
            if (textCommonInputVO == null) {
                return;
            }
            final int length = textCommonInputVO.getValue().length();
            Integer maxLength = textCommonInputVO.getMaxLength();
            if (!z11) {
                if (maxLength != null) {
                    HotelsBookAdditionsTextFieldViewHolder.this.fieldView.bindSubtitle(fieldVO.getSubtitle());
                }
                t focusLostEvent = textCommonInputVO.getFocusLostEvent();
                if (focusLostEvent == null || (lVar = HotelsBookAdditionsTextFieldViewHolder.this.tokenizedAnalytics) == null) {
                    return;
                }
                TokenizedAnalyticsExtensionsKt.processEventsWithFilterNonView(lVar, focusLostEvent, new e() { // from class: ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookAdditions.presentation.adapter.a
                    @Override // WZ.e
                    public final g modifyParams(UZ.a aVar, g gVar) {
                        g invoke$lambda$3$lambda$2;
                        invoke$lambda$3$lambda$2 = HotelsBookAdditionsTextFieldViewHolder.AnonymousClass4.invoke$lambda$3$lambda$2(length, (d) aVar, gVar);
                        return invoke$lambda$3$lambda$2;
                    }
                });
                return;
            }
            if (maxLength != null) {
                OzonSpannableString ozonSpannableString = OzonSpannableStringKt.toOzonSpannableString(HotelsBookAdditionsTextFieldViewHolder.this.processTextCounter(length, maxLength.intValue()));
                HotelsBookAdditionsTextFieldView hotelsBookAdditionsTextFieldView = HotelsBookAdditionsTextFieldViewHolder.this.fieldView;
                TextDTO subtitle = fieldVO.getSubtitle();
                hotelsBookAdditionsTextFieldView.bindSubtitle(subtitle != null ? TextDTO.copy$default(subtitle, ozonSpannableString, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, 524286, null) : null);
            }
            t clickEvent = textCommonInputVO.getClickEvent();
            if (clickEvent == null || (lVar2 = HotelsBookAdditionsTextFieldViewHolder.this.tokenizedAnalytics) == null) {
                return;
            }
            TokenizedAnalyticsExtensionsKt.processEventsWithFilterNonView$default(lVar2, clickEvent, null, 2, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookAdditions/presentation/adapter/HotelsBookAdditionsTextFieldViewHolder$Companion;", "", "<init>", "()V", "NUMBER_KEY", "", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HotelsBookAdditionsTextFieldViewHolder(@NotNull View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        HotelsBookAdditionsTextFieldView hotelsBookAdditionsTextFieldView = view instanceof HotelsBookAdditionsTextFieldView ? (HotelsBookAdditionsTextFieldView) view : null;
        this.fieldView = hotelsBookAdditionsTextFieldView;
        DebouncedTextWatcher debouncedTextWatcher = new DebouncedTextWatcher(0L, new AnonymousClass1(), new AnonymousClass2(), 1, null);
        if (hotelsBookAdditionsTextFieldView != null) {
            hotelsBookAdditionsTextFieldView.setTextWatcher(debouncedTextWatcher);
        }
        if (hotelsBookAdditionsTextFieldView != null) {
            hotelsBookAdditionsTextFieldView.setOnFocusChangeListener(new AnonymousClass4());
        }
    }

    private final void bindWithPayloads(HotelsBookAdditionsVO.FieldVO item, List<?> payloads) {
        HotelsBookAdditionsTextFieldView hotelsBookAdditionsTextFieldView;
        for (Object obj : payloads) {
            if (obj instanceof List) {
                bindWithPayloads(item, (List) obj);
            } else if (obj == HotelsBookAdditionsFieldsAdapter.Payload.SUBTITLE) {
                HotelsBookAdditionsTextFieldView hotelsBookAdditionsTextFieldView2 = this.fieldView;
                if (hotelsBookAdditionsTextFieldView2 != null) {
                    hotelsBookAdditionsTextFieldView2.bindSubtitle(item.getSubtitle());
                }
            } else if (obj == InputPayload.CHANGE_VALUE) {
                HotelsBookAdditionsTextFieldView hotelsBookAdditionsTextFieldView3 = this.fieldView;
                if (hotelsBookAdditionsTextFieldView3 != null) {
                    CommonInputVO input = item.getInput();
                    Intrinsics.g(input, "null cannot be cast to non-null type ru.ozon.app.android.travel.molecules.input.v1.CommonInputVO.TextCommonInputVO");
                    hotelsBookAdditionsTextFieldView3.updateValue((CommonInputVO.TextCommonInputVO) input);
                }
            } else if (obj == InputPayload.ERROR) {
                HotelsBookAdditionsTextFieldView hotelsBookAdditionsTextFieldView4 = this.fieldView;
                if (hotelsBookAdditionsTextFieldView4 != null) {
                    CommonInputVO input2 = item.getInput();
                    Intrinsics.g(input2, "null cannot be cast to non-null type ru.ozon.app.android.travel.molecules.input.v1.CommonInputVO.TextCommonInputVO");
                    hotelsBookAdditionsTextFieldView4.bindError((CommonInputVO.TextCommonInputVO) input2);
                }
            } else if (obj == InputPayload.CHANGE_VALUE_WITH_ERROR && (hotelsBookAdditionsTextFieldView = this.fieldView) != null) {
                CommonInputVO input3 = item.getInput();
                Intrinsics.g(input3, "null cannot be cast to non-null type ru.ozon.app.android.travel.molecules.input.v1.CommonInputVO.TextCommonInputVO");
                hotelsBookAdditionsTextFieldView.updateValue((CommonInputVO.TextCommonInputVO) item.getInput());
                hotelsBookAdditionsTextFieldView.bindError((CommonInputVO.TextCommonInputVO) item.getInput());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String processTextCounter(int count, int length) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(count);
        sb2.append('/');
        sb2.append(length);
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        return sb3;
    }

    @Override // ru.ozon.app.android.uikit.view.recycler.adapter.BaseViewHolder
    public /* bridge */ /* synthetic */ void bind(HotelsBookAdditionsVO.FieldVO fieldVO, List list) {
        bind2(fieldVO, (List<? extends Object>) list);
    }

    public final void removeCallbacks() {
        this.onTextInputChanged = null;
        this.tokenizedAnalytics = null;
    }

    public final void setupCallbacks(@NotNull InterfaceC6511n<? super Long, ? super String, ? super CharSequence, Unit> onTextInputChanged, @NotNull l tokenizedAnalytics) {
        Intrinsics.checkNotNullParameter(onTextInputChanged, "onTextInputChanged");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.onTextInputChanged = onTextInputChanged;
        this.tokenizedAnalytics = tokenizedAnalytics;
    }

    /* renamed from: bind, reason: avoid collision after fix types in other method */
    public void bind2(@NotNull HotelsBookAdditionsVO.FieldVO item, @NotNull List<? extends Object> payloads) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        this.boundedData = item;
        if (!payloads.isEmpty()) {
            bindWithPayloads(item, payloads);
            return;
        }
        HotelsBookAdditionsTextFieldView hotelsBookAdditionsTextFieldView = this.fieldView;
        if (hotelsBookAdditionsTextFieldView != null) {
            CommonInputVO input = item.getInput();
            Intrinsics.g(input, "null cannot be cast to non-null type ru.ozon.app.android.travel.molecules.input.v1.CommonInputVO.TextCommonInputVO");
            hotelsBookAdditionsTextFieldView.bindInput((CommonInputVO.TextCommonInputVO) input);
            hotelsBookAdditionsTextFieldView.bindSubtitle(item.getSubtitle());
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "newValue", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookAdditions.presentation.adapter.HotelsBookAdditionsTextFieldViewHolder$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<CharSequence, Unit> {
        AnonymousClass1() {
            super(1);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(CharSequence charSequence) {
            HotelsBookAdditionsVO.FieldVO fieldVO = HotelsBookAdditionsTextFieldViewHolder.this.boundedData;
            if (fieldVO != null) {
                HotelsBookAdditionsTextFieldViewHolder hotelsBookAdditionsTextFieldViewHolder = HotelsBookAdditionsTextFieldViewHolder.this;
                CommonInputVO input = fieldVO.getInput();
                Intrinsics.g(input, "null cannot be cast to non-null type ru.ozon.app.android.travel.molecules.input.v1.CommonInputVO.TextCommonInputVO");
                Integer maxLength = ((CommonInputVO.TextCommonInputVO) input).getMaxLength();
                if (maxLength != null) {
                    OzonSpannableString ozonSpannableString = OzonSpannableStringKt.toOzonSpannableString(hotelsBookAdditionsTextFieldViewHolder.processTextCounter(charSequence != null ? charSequence.length() : 0, maxLength.intValue()));
                    HotelsBookAdditionsTextFieldView hotelsBookAdditionsTextFieldView = hotelsBookAdditionsTextFieldViewHolder.fieldView;
                    if (hotelsBookAdditionsTextFieldView != null) {
                        TextDTO subtitle = fieldVO.getSubtitle();
                        hotelsBookAdditionsTextFieldView.bindSubtitle(subtitle != null ? TextDTO.copy$default(subtitle, ozonSpannableString, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, 524286, null) : null);
                    }
                }
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(CharSequence charSequence) {
            invoke2(charSequence);
            return Unit.f71690a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "newValue", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookAdditions.presentation.adapter.HotelsBookAdditionsTextFieldViewHolder$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function1<CharSequence, Unit> {
        AnonymousClass2() {
            super(1);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(CharSequence charSequence) {
            InterfaceC6511n interfaceC6511n;
            HotelsBookAdditionsVO.FieldVO fieldVO = HotelsBookAdditionsTextFieldViewHolder.this.boundedData;
            if (fieldVO == null || (interfaceC6511n = HotelsBookAdditionsTextFieldViewHolder.this.onTextInputChanged) == null) {
                return;
            }
            interfaceC6511n.invoke(Long.valueOf(fieldVO.getInput().getId()), fieldVO.getInput().getValue(), charSequence);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(CharSequence charSequence) {
            invoke2(charSequence);
            return Unit.f71690a;
        }
    }
}
