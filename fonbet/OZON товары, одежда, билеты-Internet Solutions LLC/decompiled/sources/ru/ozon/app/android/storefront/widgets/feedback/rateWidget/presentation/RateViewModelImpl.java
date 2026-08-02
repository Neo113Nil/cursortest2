package ru.ozon.app.android.storefront.widgets.feedback.rateWidget.presentation;

import Sc.o;
import androidx.lifecycle.V;
import androidx.lifecycle.w0;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.cells.CellAtom;
import ru.ozon.app.android.storefront.widgets.feedback.rateWidget.presentation.model.RateSection;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0001\u0018\u0000 ;2\u00020\u00012\u00020\u0002:\u0001;B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J/\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\n0\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000e\u001a\u00020\r2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ)\u0010\u0011\u001a\u00020\r2\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\n0\bH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ;\u0010\u001e\u001a\u00020\r\"\u0004\b\u0000\u0010\u001b*\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n0\b2\u0006\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"J\u001f\u0010%\u001a\u00020\r2\u0006\u0010#\u001a\u00020\t2\u0006\u0010$\u001a\u00020\tH\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020 H\u0016¢\u0006\u0004\b'\u0010\"J\u001d\u0010(\u001a\u00020\r2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016¢\u0006\u0004\b(\u0010\u000fR\u001c\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00060\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R(\u0010+\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\n0\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010-\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R \u00100\u001a\b\u0012\u0004\u0012\u00020 0/8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R \u00106\u001a\b\u0012\u0004\u0012\u000205048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b6\u00108R&\u00109\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b9\u00107\u001a\u0004\b:\u00108¨\u0006<"}, d2 = {"Lru/ozon/app/android/storefront/widgets/feedback/rateWidget/presentation/RateViewModelImpl;", "Lru/ozon/app/android/storefront/widgets/feedback/rateWidget/presentation/RateViewModel;", "Landroidx/lifecycle/w0;", "<init>", "()V", "", "Lru/ozon/app/android/storefront/widgets/feedback/rateWidget/presentation/model/RateSection;", "sections", "", "", "", "setRequestParams", "(Ljava/util/List;)Ljava/util/Map;", "", "checkRequiredSections", "(Ljava/util/List;)V", "Lru/ozon/app/android/storefront/widgets/feedback/rateWidget/presentation/model/RateSection$RequiredSection;", "checkMainButtonEnable", "(Ljava/util/Map;)V", "Lru/ozon/uni/atoms/af/AtomAction$Click;", "action", "updateCheckboxSections", "(Lru/ozon/uni/atoms/af/AtomAction$Click;)V", "section", "elementIndex", "setCheckboxSelection", "(Lru/ozon/app/android/storefront/widgets/feedback/rateWidget/presentation/model/RateSection$RequiredSection;Ljava/lang/String;)Lru/ozon/app/android/storefront/widgets/feedback/rateWidget/presentation/model/RateSection$RequiredSection;", "T", "key", "param", ProductAction.ACTION_ADD, "(Ljava/util/Map;Ljava/lang/String;Ljava/lang/Object;)V", "Lru/ozon/uni/atoms/af/AtomAction;", "onElementCheckboxClick", "(Lru/ozon/uni/atoms/af/AtomAction;)V", "sectionKey", "text", "onTextInput", "(Ljava/lang/String;Ljava/lang/String;)V", "onNextButtonClick", "onBindList", "allSectionList", "Ljava/util/List;", "requestParams", "Ljava/util/Map;", "textInputValue", "Ljava/lang/String;", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "actionTrigger", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "getActionTrigger", "()Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Landroidx/lifecycle/V;", "", "isButtonEnable", "Landroidx/lifecycle/V;", "()Landroidx/lifecycle/V;", "newList", "getNewList", "Companion", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class RateViewModelImpl extends w0 implements RateViewModel {

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    private List<RateSection> allSectionList = new ArrayList();

    @NotNull
    private Map<String, List<String>> requestParams = new LinkedHashMap();

    @NotNull
    private String textInputValue = "";

    @NotNull
    private final SingleLiveEvent<AtomAction> actionTrigger = new SingleLiveEvent<>();

    @NotNull
    private final V<Boolean> isButtonEnable = new V<>(Boolean.TRUE);

    @NotNull
    private final V<List<RateSection>> newList = new V<>();

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/storefront/widgets/feedback/rateWidget/presentation/RateViewModelImpl$Companion;", "", "<init>", "()V", "ACTION_PARAM_INDEX", "", "ACTION_PARAMS_SEPARATOR", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    private final <T> void add(Map<String, List<T>> map, String str, T t2) {
        List<T> list = map.get(str);
        if (list == null) {
            map.put(str, C7714v.m0(t2));
        } else {
            list.add(t2);
        }
    }

    private final void checkMainButtonEnable(Map<String, List<RateSection.RequiredSection>> sections) {
        boolean z11;
        Object obj;
        Collection<List<RateSection.RequiredSection>> values = sections.values();
        ArrayList arrayList = new ArrayList(C7714v.z(values, 10));
        Iterator<T> it = values.iterator();
        while (true) {
            boolean z12 = true;
            z11 = false;
            if (!it.hasNext()) {
                break;
            }
            Iterator it2 = ((List) it.next()).iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it2.next();
                RateSection.RequiredSection requiredSection = (RateSection.RequiredSection) obj;
                if (requiredSection instanceof RateSection.RequiredSection.SectionCheckbox ? ((RateSection.RequiredSection.SectionCheckbox) requiredSection).getCell().isSelected() : requiredSection instanceof RateSection.RequiredSection.SectionCheckboxIcon ? ((RateSection.RequiredSection.SectionCheckboxIcon) requiredSection).getCell().isSelected() : false) {
                    break;
                }
            }
            if (obj == null) {
                z12 = false;
            }
            arrayList.add(Boolean.valueOf(z12));
        }
        if (!arrayList.isEmpty()) {
            Iterator it3 = arrayList.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                } else if (!((Boolean) it3.next()).booleanValue()) {
                    z11 = true;
                    break;
                }
            }
        }
        isButtonEnable().setValue(Boolean.valueOf(!z11));
    }

    private final void checkRequiredSections(List<? extends RateSection> sections) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList<RateSection> arrayList = new ArrayList();
        for (Object obj : sections) {
            RateSection rateSection = (RateSection) obj;
            if ((rateSection instanceof RateSection.RequiredSection) && ((RateSection.RequiredSection) rateSection).getIsRequired()) {
                arrayList.add(obj);
            }
        }
        for (RateSection rateSection2 : arrayList) {
            Intrinsics.g(rateSection2, "null cannot be cast to non-null type ru.ozon.app.android.storefront.widgets.feedback.rateWidget.presentation.model.RateSection.RequiredSection");
            add(linkedHashMap, ((RateSection.RequiredSection) rateSection2).getKey(), rateSection2);
        }
        checkMainButtonEnable(linkedHashMap);
    }

    private final RateSection.RequiredSection setCheckboxSelection(RateSection.RequiredSection section, String elementIndex) {
        boolean z11;
        CellAtom.CellAtomWithSubtitle.CellWithSubtitleCheckboxRadio copy;
        boolean z12;
        boolean z13 = false;
        if (section instanceof RateSection.RequiredSection.SectionCheckboxIcon) {
            RateSection.RequiredSection.SectionCheckboxIcon sectionCheckboxIcon = (RateSection.RequiredSection.SectionCheckboxIcon) section;
            if (sectionCheckboxIcon.getCell().isRadio()) {
                z13 = Intrinsics.d(sectionCheckboxIcon.getCellIndex(), elementIndex);
            } else if (!Intrinsics.d(sectionCheckboxIcon.getCellIndex(), elementIndex)) {
                z13 = sectionCheckboxIcon.getCell().isSelected();
            } else if (!sectionCheckboxIcon.getCell().isSelected()) {
                z12 = true;
                return RateSection.RequiredSection.SectionCheckboxIcon.copy$default(sectionCheckboxIcon, 0, null, false, null, CellAtom.CellAtomWithSubtitle.CellWithSubtitle40IconCheckboxRadio.copy$default(sectionCheckboxIcon.getCell(), null, null, z12, false, false, null, false, null, null, null, null, null, null, null, false, false, null, null, null, 524283, null), 15, null);
            }
            z12 = z13;
            return RateSection.RequiredSection.SectionCheckboxIcon.copy$default(sectionCheckboxIcon, 0, null, false, null, CellAtom.CellAtomWithSubtitle.CellWithSubtitle40IconCheckboxRadio.copy$default(sectionCheckboxIcon.getCell(), null, null, z12, false, false, null, false, null, null, null, null, null, null, null, false, false, null, null, null, 524283, null), 15, null);
        }
        if (!(section instanceof RateSection.RequiredSection.SectionCheckbox)) {
            return section;
        }
        RateSection.RequiredSection.SectionCheckbox sectionCheckbox = (RateSection.RequiredSection.SectionCheckbox) section;
        if (sectionCheckbox.getCell().isRadio()) {
            z13 = Intrinsics.d(sectionCheckbox.getCellIndex(), elementIndex);
        } else if (!Intrinsics.d(sectionCheckbox.getCellIndex(), elementIndex)) {
            z13 = sectionCheckbox.getCell().isSelected();
        } else if (!sectionCheckbox.getCell().isSelected()) {
            z11 = true;
            copy = r6.copy((r32 & 1) != 0 ? r6.isSelected : z11, (r32 & 2) != 0 ? r6.isRadio : false, (r32 & 4) != 0 ? r6.isAutoToggleDisabled : false, (r32 & 8) != 0 ? r6.title : null, (r32 & 16) != 0 ? r6.titleColor : null, (r32 & 32) != 0 ? r6.subtitle : null, (r32 & 64) != 0 ? r6.subtitleColor : null, (r32 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? r6.align : null, (r32 & 256) != 0 ? r6.maxLines : null, (r32 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? r6.action : null, (r32 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? r6.hideSeparator : false, (r32 & 2048) != 0 ? r6.colorDisabledAsEnabled : false, (r32 & 4096) != 0 ? r6.context : null, (r32 & 8192) != 0 ? r6.testInfo : null, (r32 & 16384) != 0 ? sectionCheckbox.getCell().trackingInfo : null);
            return RateSection.RequiredSection.SectionCheckbox.copy$default(sectionCheckbox, 0, null, false, null, copy, 15, null);
        }
        z11 = z13;
        copy = r6.copy((r32 & 1) != 0 ? r6.isSelected : z11, (r32 & 2) != 0 ? r6.isRadio : false, (r32 & 4) != 0 ? r6.isAutoToggleDisabled : false, (r32 & 8) != 0 ? r6.title : null, (r32 & 16) != 0 ? r6.titleColor : null, (r32 & 32) != 0 ? r6.subtitle : null, (r32 & 64) != 0 ? r6.subtitleColor : null, (r32 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? r6.align : null, (r32 & 256) != 0 ? r6.maxLines : null, (r32 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? r6.action : null, (r32 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? r6.hideSeparator : false, (r32 & 2048) != 0 ? r6.colorDisabledAsEnabled : false, (r32 & 4096) != 0 ? r6.context : null, (r32 & 8192) != 0 ? r6.testInfo : null, (r32 & 16384) != 0 ? sectionCheckbox.getCell().trackingInfo : null);
        return RateSection.RequiredSection.SectionCheckbox.copy$default(sectionCheckbox, 0, null, false, null, copy, 15, null);
    }

    private final Map<String, List<String>> setRequestParams(List<? extends RateSection> sections) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (RateSection rateSection : sections) {
            if (rateSection instanceof RateSection.RequiredSection) {
                RateSection.RequiredSection requiredSection = (RateSection.RequiredSection) rateSection;
                if (requiredSection instanceof RateSection.RequiredSection.SectionCheckbox) {
                    RateSection.RequiredSection.SectionCheckbox sectionCheckbox = (RateSection.RequiredSection.SectionCheckbox) rateSection;
                    if (sectionCheckbox.getCell().isSelected()) {
                        add(linkedHashMap, sectionCheckbox.getKey(), sectionCheckbox.getCellIndex());
                    }
                } else if (requiredSection instanceof RateSection.RequiredSection.SectionCheckboxIcon) {
                    RateSection.RequiredSection.SectionCheckboxIcon sectionCheckboxIcon = (RateSection.RequiredSection.SectionCheckboxIcon) rateSection;
                    if (sectionCheckboxIcon.getCell().isSelected()) {
                        add(linkedHashMap, sectionCheckboxIcon.getKey(), sectionCheckboxIcon.getCellIndex());
                    }
                } else {
                    if (!(requiredSection instanceof RateSection.RequiredSection.SectionTextInput)) {
                        throw new o();
                    }
                    add(linkedHashMap, ((RateSection.RequiredSection.SectionTextInput) rateSection).getKey(), this.textInputValue);
                }
            }
        }
        return linkedHashMap;
    }

    private final void updateCheckboxSections(AtomAction.Click action) {
        String str;
        Map<String, String> params = action.getParams();
        if (params == null || (str = params.get("index")) == null) {
            return;
        }
        List<RateSection> list = this.allSectionList;
        ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
        for (Object obj : list) {
            if (obj instanceof RateSection.RequiredSection) {
                RateSection.RequiredSection requiredSection = (RateSection.RequiredSection) obj;
                if (Intrinsics.d(requiredSection.getKey(), action.getId())) {
                    obj = setCheckboxSelection(requiredSection, str);
                }
            }
            arrayList.add(obj);
        }
        getNewList().setValue(arrayList);
    }

    @Override // ru.ozon.app.android.storefront.widgets.feedback.rateWidget.presentation.RateViewModel
    public void onBindList(@NotNull List<? extends RateSection> sections) {
        Intrinsics.checkNotNullParameter(sections, "sections");
        ArrayList W02 = C7714v.W0(sections);
        this.allSectionList = W02;
        checkRequiredSections(W02);
        this.requestParams = setRequestParams(this.allSectionList);
        getNewList().setValue(this.allSectionList);
    }

    @Override // ru.ozon.app.android.storefront.widgets.feedback.rateWidget.presentation.RateViewModel
    public void onElementCheckboxClick(@NotNull AtomAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (action instanceof AtomAction.Click) {
            updateCheckboxSections((AtomAction.Click) action);
        }
    }

    @Override // ru.ozon.app.android.storefront.widgets.feedback.rateWidget.presentation.RateViewModel
    public void onNextButtonClick(@NotNull AtomAction action) {
        AtomAction.ComposerAction copy$default;
        Map<String, String> params;
        Intrinsics.checkNotNullParameter(action, "action");
        boolean z11 = action instanceof AtomAction.ComposerAction;
        AtomAction.ComposerAction composerAction = z11 ? (AtomAction.ComposerAction) action : null;
        LinkedHashMap linkedHashMap = (composerAction == null || (params = composerAction.getParams()) == null) ? new LinkedHashMap() : U.u(params);
        Iterator<T> it = this.requestParams.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String V11 = C7714v.V((Iterable) entry.getValue(), ",", null, null, null, 62);
            if (V11.length() > 0) {
                linkedHashMap.put(entry.getKey(), V11);
            }
        }
        SingleLiveEvent<AtomAction> actionTrigger = getActionTrigger();
        AtomAction.ComposerAction composerAction2 = z11 ? (AtomAction.ComposerAction) action : null;
        if (composerAction2 != null && (copy$default = AtomAction.ComposerAction.copy$default(composerAction2, null, null, linkedHashMap, null, null, 27, null)) != null) {
            action = copy$default;
        }
        actionTrigger.setValue(action);
    }

    @Override // ru.ozon.app.android.storefront.widgets.feedback.rateWidget.presentation.RateViewModel
    public void onTextInput(@NotNull String sectionKey, @NotNull String text) {
        Intrinsics.checkNotNullParameter(sectionKey, "sectionKey");
        Intrinsics.checkNotNullParameter(text, "text");
        this.textInputValue = text;
        List<String> list = this.requestParams.get(sectionKey);
        if (list != null) {
            list.set(0, text);
        }
    }

    @Override // ru.ozon.app.android.storefront.widgets.feedback.rateWidget.presentation.RateViewModel
    @NotNull
    public SingleLiveEvent<AtomAction> getActionTrigger() {
        return this.actionTrigger;
    }

    @Override // ru.ozon.app.android.storefront.widgets.feedback.rateWidget.presentation.RateViewModel
    @NotNull
    public V<List<RateSection>> getNewList() {
        return this.newList;
    }

    @Override // ru.ozon.app.android.storefront.widgets.feedback.rateWidget.presentation.RateViewModel
    @NotNull
    public V<Boolean> isButtonEnable() {
        return this.isButtonEnable;
    }
}
