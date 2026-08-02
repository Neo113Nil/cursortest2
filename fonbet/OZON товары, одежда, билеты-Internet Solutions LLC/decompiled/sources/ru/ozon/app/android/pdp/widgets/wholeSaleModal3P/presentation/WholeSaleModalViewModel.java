package ru.ozon.app.android.pdp.widgets.wholeSaleModal3P.presentation;

import Ae.C2399j;
import Ae.M0;
import Ae.O0;
import Ae.x0;
import Sc.o;
import U7.d;
import UZ.a;
import WZ.g;
import WZ.l;
import WZ.t;
import android.util.Base64;
import androidx.lifecycle.w0;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.pdp.widgets.wholeSaleModal3P.data.DeliveryType;
import ru.ozon.app.android.pdp.widgets.wholeSaleModal3P.presentation.ViewIntent;
import ru.ozon.app.android.pdp.widgets.wholeSaleModal3P.presentation.wholeSaleModal.WholeSaleModalVI;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;

@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0001\u0018\u0000 W2\u00020\u0001:\u0001WB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u000f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ7\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J-\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ'\u0010\"\u001a\u00020\u0006*\u00060\u001ej\u0002`\u001f2\u0006\u0010 \u001a\u00020\t2\u0006\u0010!\u001a\u00020\tH\u0002¢\u0006\u0004\b\"\u0010#J\u0013\u0010$\u001a\u00020\t*\u00020\tH\u0002¢\u0006\u0004\b$\u0010\u001dJ\u0013\u0010%\u001a\u00020\t*\u00020\tH\u0002¢\u0006\u0004\b%\u0010\u001dJ'\u0010'\u001a\u00020\u0006*\u00060\u001ej\u0002`\u001f2\u0006\u0010&\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b'\u0010#J\u001b\u0010)\u001a\u00020(*\u00020(2\u0006\u0010\u001b\u001a\u00020\tH\u0002¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u0006H\u0014¢\u0006\u0004\b+\u0010\u0003J\u0015\u0010.\u001a\u00020\u00062\u0006\u0010-\u001a\u00020,¢\u0006\u0004\b.\u0010/J\u0019\u00103\u001a\u00020\u00062\n\u00102\u001a\u000600j\u0002`1¢\u0006\u0004\b3\u00104J\u0015\u00107\u001a\u00020\u00062\u0006\u00106\u001a\u000205¢\u0006\u0004\b7\u00108J!\u0010=\u001a\u0004\u0018\u00010<2\u0006\u00109\u001a\u00020\t2\b\u0010;\u001a\u0004\u0018\u00010:¢\u0006\u0004\b=\u0010>J\u0019\u0010A\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020@0?¢\u0006\u0004\bA\u0010BR\u0016\u0010C\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0018\u0010E\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u001e\u00102\u001a\n\u0018\u000100j\u0004\u0018\u0001`18\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010GR\u001a\u0010J\u001a\b\u0012\u0004\u0012\u00020I0H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u001d\u0010M\u001a\b\u0012\u0004\u0012\u00020I0L8\u0006¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010PR(\u0010Q\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00130H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010KR+\u0010R\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00130L8\u0006¢\u0006\f\n\u0004\bR\u0010N\u001a\u0004\bS\u0010PR(\u0010T\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00130H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010KR+\u0010U\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00130L8\u0006¢\u0006\f\n\u0004\bU\u0010N\u001a\u0004\bV\u0010P¨\u0006X"}, d2 = {"Lru/ozon/app/android/pdp/widgets/wholeSaleModal3P/presentation/WholeSaleModalViewModel;", "Landroidx/lifecycle/w0;", "<init>", "()V", "", "index", "", "updateSelectedTab", "(I)V", "", "newValue", "", "focusWasCleared", "updateCount", "(Ljava/lang/String;Z)V", "updateRegionText", "Lru/ozon/app/android/pdp/widgets/wholeSaleModal3P/presentation/wholeSaleModal/WholeSaleModalVI$TextInput;", "textInput", AppMeasurementSdk.ConditionalUserProperty.VALUE, "Lkotlin/Pair;", "handleInput", "(Lru/ozon/app/android/pdp/widgets/wholeSaleModal3P/presentation/wholeSaleModal/WholeSaleModalVI$TextInput;Ljava/lang/String;Z)Lkotlin/Pair;", "validateFields", "()Z", "currentValue", "validateField", "(Lru/ozon/app/android/pdp/widgets/wholeSaleModal3P/presentation/wholeSaleModal/WholeSaleModalVI$TextInput;Ljava/lang/String;)Lkotlin/Pair;", "template", "fillTemplate", "(Ljava/lang/String;)Ljava/lang/String;", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "placeholderKey", "textValue", "fillTemplateBlock", "(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V", "getStartWrapTag", "getEndWrapTag", "oldValue", "replace", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "withEncodedParameter", "(Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/lang/String;)Lru/ozon/uni/atoms/data/AtomActionDTO;", "onCleared", "Lru/ozon/app/android/pdp/widgets/wholeSaleModal3P/presentation/wholeSaleModal/WholeSaleModalVI;", "model", "setModalVI", "(Lru/ozon/app/android/pdp/widgets/wholeSaleModal3P/presentation/wholeSaleModal/WholeSaleModalVI;)V", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "setTokenizedAnalytics", "(LWZ/l;)V", "Lru/ozon/app/android/pdp/widgets/wholeSaleModal3P/presentation/ViewIntent;", "intent", "onViewIntent", "(Lru/ozon/app/android/pdp/widgets/wholeSaleModal3P/presentation/ViewIntent;)V", "messageTemplate", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "controlSettings", "Lru/ozon/uni/atoms/af/AtomAction;", "sendMessagePressed", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;)Lru/ozon/uni/atoms/af/AtomAction;", "", "", "getCustomTrackingInfo", "()Ljava/util/Map;", "wasSend", "Z", "modalVI", "Lru/ozon/app/android/pdp/widgets/wholeSaleModal3P/presentation/wholeSaleModal/WholeSaleModalVI;", "LWZ/l;", "LAe/x0;", "Lru/ozon/app/android/pdp/widgets/wholeSaleModal3P/data/DeliveryType;", "_selectedTab", "LAe/x0;", "LAe/M0;", "selectedTab", "LAe/M0;", "getSelectedTab", "()LAe/M0;", "_countFlow", "countFlow", "getCountFlow", "_regionFlow", "regionFlow", "getRegionFlow", "Companion", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class WholeSaleModalViewModel extends w0 {

    @NotNull
    private final x0<Pair<String, String>> _countFlow;

    @NotNull
    private final x0<Pair<String, String>> _regionFlow;

    @NotNull
    private final x0<DeliveryType> _selectedTab;

    @NotNull
    private final M0<Pair<String, String>> countFlow;
    private WholeSaleModalVI modalVI;

    @NotNull
    private final M0<Pair<String, String>> regionFlow;

    @NotNull
    private final M0<DeliveryType> selectedTab;
    private l tokenizedAnalytics;
    private boolean wasSend;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/pdp/widgets/wholeSaleModal3P/presentation/WholeSaleModalViewModel$Companion;", "", "<init>", "()V", "WRAP_TAG_END", "", "START_TAG_SUFFIX", "END_TAG_SUFFIX", "QUANTITY_TRACKING_KEY", "DELIVERY_TRACKING_KEY", "REGION_TRACKING_KEY", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public WholeSaleModalViewModel() {
        x0<DeliveryType> a11 = O0.a(DeliveryType.Pickup);
        this._selectedTab = a11;
        this.selectedTab = C2399j.b(a11);
        x0<Pair<String, String>> a12 = O0.a(new Pair("", null));
        this._countFlow = a12;
        this.countFlow = C2399j.b(a12);
        x0<Pair<String, String>> a13 = O0.a(new Pair("", null));
        this._regionFlow = a13;
        this.regionFlow = C2399j.b(a13);
    }

    private final String fillTemplate(String template) {
        WholeSaleModalVI wholeSaleModalVI = this.modalVI;
        if (wholeSaleModalVI == null) {
            return template;
        }
        StringBuilder sb2 = new StringBuilder(template);
        fillTemplateBlock(sb2, wholeSaleModalVI.getCountTextInput().getMessagePlaceholderKey(), this._countFlow.getValue().e());
        DeliveryType value = this._selectedTab.getValue();
        replace(sb2, wholeSaleModalVI.getDeliveryTabs().getMessagePlaceholderKey(), wholeSaleModalVI.getDeliveryTabs().getTabs().getTabs().get(wholeSaleModalVI.getDeliveryTabs().getTrackingTypes().indexOf(value)).getTitle());
        fillTemplateBlock(sb2, wholeSaleModalVI.getRegionTextInput().getMessagePlaceholderKey(), value == DeliveryType.Pickup ? this._regionFlow.getValue().e() : "");
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        return sb3;
    }

    private final void fillTemplateBlock(StringBuilder sb2, String str, String str2) {
        String startWrapTag = getStartWrapTag(str);
        if (!h.K(str2)) {
            replace(sb2, str, str2);
            if (h.t(sb2, startWrapTag, false)) {
                replace(sb2, startWrapTag, "");
                replace(sb2, getEndWrapTag(str), "");
                return;
            }
            return;
        }
        String endWrapTag = getEndWrapTag(str);
        int indexOf = sb2.indexOf(startWrapTag);
        int length = endWrapTag.length() + sb2.indexOf(endWrapTag);
        if (indexOf == -1 || length == -1) {
            return;
        }
        sb2.delete(indexOf, length);
    }

    private final String getEndWrapTag(String str) {
        return h.X(str, "}}", "End}}", false);
    }

    private final String getStartWrapTag(String str) {
        return h.X(str, "}}", "Start}}", false);
    }

    private final Pair<String, String> handleInput(WholeSaleModalVI.TextInput textInput, String value, boolean focusWasCleared) {
        if (focusWasCleared) {
            return validateField(textInput, value);
        }
        if (textInput.getIsDigit()) {
            StringBuilder sb2 = new StringBuilder();
            int length = value.length();
            for (int i11 = 0; i11 < length; i11++) {
                char charAt = value.charAt(i11);
                if (Character.isDigit(charAt)) {
                    sb2.append(charAt);
                }
            }
            String sb3 = sb2.toString();
            Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
            Long y02 = h.y0(sb3);
            value = y02 != null ? String.valueOf(Math.min(y02.longValue(), 2147483647L)) : null;
            if (value == null) {
                value = "";
            }
        }
        return new Pair<>(value, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g onCleared$lambda$1$lambda$0(WholeSaleModalViewModel wholeSaleModalViewModel, a aVar, g params) {
        Intrinsics.checkNotNullParameter(aVar, "<unused var>");
        Intrinsics.checkNotNullParameter(params, "params");
        return g.a(params, wholeSaleModalViewModel.getCustomTrackingInfo(), null, 2);
    }

    private final void replace(StringBuilder sb2, String str, String str2) {
        int indexOf = sb2.indexOf(str);
        if (indexOf != -1) {
            sb2.replace(indexOf, str.length() + indexOf, str2);
        }
    }

    private final void updateCount(String newValue, boolean focusWasCleared) {
        Pair<String, String> handleInput;
        WholeSaleModalVI wholeSaleModalVI = this.modalVI;
        if (wholeSaleModalVI == null || (handleInput = handleInput(wholeSaleModalVI.getCountTextInput(), newValue, focusWasCleared)) == null) {
            return;
        }
        this._countFlow.setValue(handleInput);
    }

    private final void updateRegionText(String newValue, boolean focusWasCleared) {
        Pair<String, String> handleInput;
        WholeSaleModalVI wholeSaleModalVI = this.modalVI;
        if (wholeSaleModalVI == null || (handleInput = handleInput(wholeSaleModalVI.getRegionTextInput(), newValue, focusWasCleared)) == null) {
            return;
        }
        this._regionFlow.setValue(handleInput);
    }

    private final void updateSelectedTab(int index) {
        WholeSaleModalVI wholeSaleModalVI = this.modalVI;
        if (wholeSaleModalVI != null) {
            this._selectedTab.setValue(wholeSaleModalVI.getDeliveryTabs().getTrackingTypes().get(index));
        }
    }

    private final Pair<String, String> validateField(WholeSaleModalVI.TextInput textInput, String currentValue) {
        String str;
        if (textInput.getErrorRequiredText() == null || !h.K(currentValue)) {
            if (textInput.getMinCount() != null) {
                Integer w02 = h.w0(currentValue);
                if ((w02 != null ? w02.intValue() : Integer.MAX_VALUE) < textInput.getMinCount().intValue()) {
                    str = textInput.getHint();
                    if (str == null) {
                        str = "";
                    }
                }
            }
            str = null;
        } else {
            str = textInput.getErrorRequiredText();
        }
        if (str != null) {
            return new Pair<>(currentValue, str);
        }
        return null;
    }

    private final boolean validateFields() {
        Pair<String, String> validateField;
        WholeSaleModalVI wholeSaleModalVI = this.modalVI;
        boolean z11 = true;
        if (wholeSaleModalVI != null) {
            Pair<String, String> validateField2 = validateField(wholeSaleModalVI.getCountTextInput(), this._countFlow.getValue().e());
            if (validateField2 != null) {
                this._countFlow.setValue(validateField2);
                z11 = false;
            }
            if (this.selectedTab.getValue() == DeliveryType.Pickup && (validateField = validateField(wholeSaleModalVI.getRegionTextInput(), this._regionFlow.getValue().e())) != null) {
                this._regionFlow.setValue(validateField);
                return false;
            }
        }
        return z11;
    }

    private final AtomActionDTO withEncodedParameter(AtomActionDTO atomActionDTO, String str) {
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        return AtomActionDTO.copy$default(atomActionDTO, null, d.e(atomActionDTO.getLink(), Base64.encodeToString(bytes, 0)), null, null, null, 29, null);
    }

    @NotNull
    public final M0<Pair<String, String>> getCountFlow() {
        return this.countFlow;
    }

    @NotNull
    public final Map<String, Object> getCustomTrackingInfo() {
        Tc.d builder = new Tc.d();
        String e11 = this._countFlow.getValue().e();
        if (!h.K(e11)) {
            builder.put("quantity", e11);
        }
        builder.put("deliveryType", this._selectedTab.getValue().name());
        String e12 = this._regionFlow.getValue().e();
        if (!h.K(e12)) {
            builder.put(SelectionItemFormDTO.TITLE_FIELD_NAME, e12);
        }
        Intrinsics.checkNotNullParameter(builder, "builder");
        return builder.u();
    }

    @NotNull
    public final M0<Pair<String, String>> getRegionFlow() {
        return this.regionFlow;
    }

    @NotNull
    public final M0<DeliveryType> getSelectedTab() {
        return this.selectedTab;
    }

    @Override // androidx.lifecycle.w0
    protected void onCleared() {
        WholeSaleModalVI wholeSaleModalVI;
        t closeTokenizedEvent;
        l lVar;
        if (!this.wasSend && ((!h.K(this._countFlow.getValue().e()) || !h.K(this._regionFlow.getValue().e())) && (wholeSaleModalVI = this.modalVI) != null && (closeTokenizedEvent = wholeSaleModalVI.getCloseTokenizedEvent()) != null && (lVar = this.tokenizedAnalytics) != null)) {
            TokenizedAnalyticsExtensionsKt.processClickEvents(lVar, closeTokenizedEvent, new SS.a(this, 1));
        }
        this.modalVI = null;
        this.tokenizedAnalytics = null;
    }

    public final void onViewIntent(@NotNull ViewIntent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        if (intent instanceof ViewIntent.TabSelected) {
            updateSelectedTab(((ViewIntent.TabSelected) intent).getIndex());
            return;
        }
        if (intent instanceof ViewIntent.CountInputUpdated) {
            ViewIntent.CountInputUpdated countInputUpdated = (ViewIntent.CountInputUpdated) intent;
            updateCount(countInputUpdated.getText(), countInputUpdated.getFocusWasCleared());
        } else {
            if (!(intent instanceof ViewIntent.RegionInputUpdated)) {
                throw new o();
            }
            ViewIntent.RegionInputUpdated regionInputUpdated = (ViewIntent.RegionInputUpdated) intent;
            updateRegionText(regionInputUpdated.getText(), regionInputUpdated.getFocusWasCleared());
        }
    }

    public final AtomAction sendMessagePressed(@NotNull String messageTemplate, CommonControlSettings controlSettings) {
        AtomActionDTO action;
        AtomActionDTO withEncodedParameter;
        Intrinsics.checkNotNullParameter(messageTemplate, "messageTemplate");
        if (validateFields()) {
            this.wasSend = true;
            if (controlSettings != null && (action = controlSettings.getAction()) != null && (withEncodedParameter = withEncodedParameter(action, fillTemplate(messageTemplate))) != null) {
                return AtomActionMapperKt.toAtomAction(withEncodedParameter, null);
            }
        }
        return null;
    }

    public final void setModalVI(@NotNull WholeSaleModalVI model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.modalVI = model;
        updateSelectedTab(model.getDeliveryTabs().getTabs().getSelectedTabIndex());
    }

    public final void setTokenizedAnalytics(@NotNull l tokenizedAnalytics) {
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.tokenizedAnalytics = tokenizedAnalytics;
    }
}
