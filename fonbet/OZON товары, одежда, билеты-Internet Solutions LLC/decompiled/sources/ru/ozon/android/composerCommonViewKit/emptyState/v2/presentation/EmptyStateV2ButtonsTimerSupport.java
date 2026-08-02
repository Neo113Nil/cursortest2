package ru.ozon.android.composerCommonViewKit.emptyState.v2.presentation;

import Ae.M0;
import Sc.InterfaceC4008j;
import Sc.k;
import Sc.n;
import android.view.View;
import androidx.lifecycle.C0;
import androidx.lifecycle.J;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.collections.U;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import l10.v;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.emptyState.v2.data.mapper.TimerMappersKt;
import ru.ozon.android.composerCommonViewKit.emptyState.v2.data.model.ActionSignature;
import ru.ozon.android.composerCommonViewKit.emptyState.v2.data.model.TimerButtonConfig;
import ru.ozon.android.composerCommonViewKit.emptyState.v2.data.timers.ButtonBinding;
import ru.ozon.android.composerCommonViewKit.emptyState.v2.presentation.vm.TimerViewModel;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import xe.B0;
import xe.C10727i;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0018\u0010\n\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0004\u0012\u00020\t0\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\tH\u0002¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0017\u0010\u000eJ#\u0010\u001c\u001a\u00020\t2\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u0018H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001b\u0010\u001e\u001a\u00020\t2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010\"\u001a\u00020\t2\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010$R&\u0010\n\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0004\u0012\u00020\t0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010%R\u0018\u0010'\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u001c\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00100\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00190+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u001d\u0010\u0014\u001a\u0004\u0018\u00010\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101¨\u00062"}, d2 = {"Lru/ozon/android/composerCommonViewKit/emptyState/v2/presentation/EmptyStateV2ButtonsTimerSupport;", "", "Landroid/view/View;", "view", "Ll10/v;", "viewModelOwnerProvider", "Lkotlin/Function1;", "", "Lru/ozon/uni/atoms/data/AtomDTO;", "", "onButtonsUpdated", "<init>", "(Landroid/view/View;Ll10/v;Lkotlin/jvm/functions/Function1;)V", "syncAndRender", "()V", "buttons", "Lru/ozon/android/composerCommonViewKit/emptyState/v2/data/timers/ButtonBinding;", "prepareBindings", "(Ljava/util/List;)Ljava/util/List;", "Lru/ozon/android/composerCommonViewKit/emptyState/v2/presentation/vm/TimerViewModel;", "timerViewModel", "startCollecting", "(Lru/ozon/android/composerCommonViewKit/emptyState/v2/presentation/vm/TimerViewModel;)V", "stopCollecting", "", "", "Lru/ozon/android/composerCommonViewKit/emptyState/v2/presentation/vm/TimerViewModel$TimerState;", "states", "render", "(Ljava/util/Map;)V", "bind", "(Ljava/util/List;)V", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "onAction", "(Lru/ozon/uni/atoms/af/AtomAction;)V", "Landroid/view/View;", "Lkotlin/jvm/functions/Function1;", "Lxe/B0;", "timerCollectorJob", "Lxe/B0;", "buttonBindings", "Ljava/util/List;", "", "startedTimerKeys", "Ljava/util/Set;", "timerViewModel$delegate", "LSc/j;", "getTimerViewModel", "()Lru/ozon/android/composerCommonViewKit/emptyState/v2/presentation/vm/TimerViewModel;", "common-view-kit_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class EmptyStateV2ButtonsTimerSupport {

    @NotNull
    private List<ButtonBinding> buttonBindings;

    @NotNull
    private final Function1<List<? extends AtomDTO>, Unit> onButtonsUpdated;

    @NotNull
    private final Set<String> startedTimerKeys;
    private B0 timerCollectorJob;

    /* renamed from: timerViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j timerViewModel;

    @NotNull
    private final View view;

    /* JADX WARN: Multi-variable type inference failed */
    public EmptyStateV2ButtonsTimerSupport(@NotNull View view, @NotNull v viewModelOwnerProvider, @NotNull Function1<? super List<? extends AtomDTO>, Unit> onButtonsUpdated) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(viewModelOwnerProvider, "viewModelOwnerProvider");
        Intrinsics.checkNotNullParameter(onButtonsUpdated, "onButtonsUpdated");
        this.view = view;
        this.onButtonsUpdated = onButtonsUpdated;
        this.buttonBindings = K.f71697a;
        this.startedTimerKeys = new LinkedHashSet();
        this.timerViewModel = k.a(n.NONE, new EmptyStateV2ButtonsTimerSupport$timerViewModel$2(viewModelOwnerProvider));
        view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: ru.ozon.android.composerCommonViewKit.emptyState.v2.presentation.EmptyStateV2ButtonsTimerSupport.1
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View v11) {
                Intrinsics.checkNotNullParameter(v11, "v");
                TimerViewModel timerViewModel = EmptyStateV2ButtonsTimerSupport.this.getTimerViewModel();
                if (timerViewModel == null) {
                    return;
                }
                List list = EmptyStateV2ButtonsTimerSupport.this.buttonBindings;
                if ((list instanceof Collection) && list.isEmpty()) {
                    return;
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (((ButtonBinding) it.next()).getTimerConfig() != null) {
                        EmptyStateV2ButtonsTimerSupport.this.startCollecting(timerViewModel);
                        EmptyStateV2ButtonsTimerSupport.this.render(timerViewModel.getTimerStates().getValue());
                        return;
                    }
                }
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View v11) {
                Intrinsics.checkNotNullParameter(v11, "v");
                EmptyStateV2ButtonsTimerSupport.this.stopCollecting();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TimerViewModel getTimerViewModel() {
        return (TimerViewModel) this.timerViewModel.getValue();
    }

    private final List<ButtonBinding> prepareBindings(List<? extends AtomDTO> buttons) {
        List<? extends AtomDTO> list = buttons;
        ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
        int i11 = 0;
        for (Object obj : list) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            AtomDTO atomDTO = (AtomDTO) obj;
            ButtonV3DTO buttonV3DTO = atomDTO instanceof ButtonV3DTO ? (ButtonV3DTO) atomDTO : null;
            arrayList.add(buttonV3DTO == null ? new ButtonBinding(atomDTO, null) : new ButtonBinding(atomDTO, TimerMappersKt.toTimerConfig(buttonV3DTO, i11)));
            i11 = i12;
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void render(Map<String, TimerViewModel.TimerState> states) {
        List<ButtonBinding> list = this.buttonBindings;
        ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
        for (ButtonBinding buttonBinding : list) {
            TimerButtonConfig timerConfig = buttonBinding.getTimerConfig();
            AtomDTO atom = buttonBinding.getAtom();
            ButtonV3DTO buttonV3DTO = atom instanceof ButtonV3DTO ? (ButtonV3DTO) atom : null;
            arrayList.add((timerConfig == null || buttonV3DTO == null) ? buttonBinding.getAtom() : timerConfig.render(buttonV3DTO, states.get(timerConfig.getTimerKey())));
        }
        this.onButtonsUpdated.invoke(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startCollecting(TimerViewModel timerViewModel) {
        J a11;
        B0 b02 = this.timerCollectorJob;
        if ((b02 == null || !b02.isActive()) && (a11 = C0.a(this.view)) != null) {
            this.timerCollectorJob = C10727i.c(androidx.lifecycle.K.a(a11), null, null, new EmptyStateV2ButtonsTimerSupport$startCollecting$1(a11, timerViewModel, this, null), 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void stopCollecting() {
        B0 b02 = this.timerCollectorJob;
        if (b02 != null) {
            b02.j(null);
        }
        this.timerCollectorJob = null;
    }

    private final void syncAndRender() {
        TimerViewModel timerViewModel = getTimerViewModel();
        List<ButtonBinding> list = this.buttonBindings;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            TimerButtonConfig timerConfig = ((ButtonBinding) it.next()).getTimerConfig();
            if (timerConfig != null) {
                arrayList.add(timerConfig);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (this.startedTimerKeys.contains(((TimerButtonConfig) next).getTimerKey())) {
                arrayList2.add(next);
            }
        }
        int h11 = U.h(C7714v.z(arrayList2, 10));
        if (h11 < 16) {
            h11 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(h11);
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            TimerButtonConfig timerButtonConfig = (TimerButtonConfig) it3.next();
            Pair pair = new Pair(timerButtonConfig.getTimerKey(), Integer.valueOf(timerButtonConfig.getTotalSeconds()));
            linkedHashMap.put(pair.e(), pair.f());
        }
        Map<String, Integer> t2 = U.t(linkedHashMap);
        if (timerViewModel != null && !t2.isEmpty()) {
            timerViewModel.syncTimers(t2);
            startCollecting(timerViewModel);
            render(timerViewModel.getTimerStates().getValue());
        } else {
            if (timerViewModel != null) {
                timerViewModel.syncTimers(U.c());
            }
            stopCollecting();
            render(U.c());
        }
    }

    public final void bind(@NotNull List<? extends AtomDTO> buttons) {
        Map<String, TimerViewModel.TimerState> map;
        TimerViewModel.TimerState timerState;
        M0<Map<String, TimerViewModel.TimerState>> timerStates;
        Intrinsics.checkNotNullParameter(buttons, "buttons");
        List<ButtonBinding> prepareBindings = prepareBindings(buttons);
        this.buttonBindings = prepareBindings;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = prepareBindings.iterator();
        while (true) {
            map = null;
            map = null;
            if (!it.hasNext()) {
                break;
            }
            TimerButtonConfig timerConfig = ((ButtonBinding) it.next()).getTimerConfig();
            String timerKey = timerConfig != null ? timerConfig.getTimerKey() : null;
            if (timerKey != null) {
                arrayList.add(timerKey);
            }
        }
        this.startedTimerKeys.retainAll(C7714v.Y0(arrayList));
        TimerViewModel timerViewModel = getTimerViewModel();
        if (timerViewModel != null && (timerStates = timerViewModel.getTimerStates()) != null) {
            map = timerStates.getValue();
        }
        if (map == null) {
            map = U.c();
        }
        List<ButtonBinding> list = this.buttonBindings;
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            TimerButtonConfig timerConfig2 = ((ButtonBinding) it2.next()).getTimerConfig();
            if (timerConfig2 != null) {
                arrayList2.add(timerConfig2);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            Object next = it3.next();
            TimerButtonConfig timerButtonConfig = (TimerButtonConfig) next;
            if (!timerButtonConfig.getStartOnBind() && ((timerState = map.get(timerButtonConfig.getTimerKey())) == null || !timerState.getIsActive())) {
                arrayList3.add(next);
            }
        }
        Iterator it4 = arrayList3.iterator();
        while (it4.hasNext()) {
            this.startedTimerKeys.remove(((TimerButtonConfig) it4.next()).getTimerKey());
        }
        List<ButtonBinding> list2 = this.buttonBindings;
        ArrayList arrayList4 = new ArrayList();
        Iterator<T> it5 = list2.iterator();
        while (it5.hasNext()) {
            TimerButtonConfig timerConfig3 = ((ButtonBinding) it5.next()).getTimerConfig();
            if (timerConfig3 != null) {
                arrayList4.add(timerConfig3);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        Iterator it6 = arrayList4.iterator();
        while (it6.hasNext()) {
            Object next2 = it6.next();
            if (((TimerButtonConfig) next2).getStartOnBind()) {
                arrayList5.add(next2);
            }
        }
        Iterator it7 = arrayList5.iterator();
        while (it7.hasNext()) {
            this.startedTimerKeys.add(((TimerButtonConfig) it7.next()).getTimerKey());
        }
        syncAndRender();
    }

    public final void onAction(@NotNull AtomAction action) {
        M0<Map<String, TimerViewModel.TimerState>> timerStates;
        Intrinsics.checkNotNullParameter(action, "action");
        ActionSignature actionSignature = TimerMappersKt.toActionSignature(action);
        String id2 = action.getId();
        Map<String, TimerViewModel.TimerState> map = null;
        if (id2 == null || h.K(id2)) {
            id2 = null;
        }
        TimerViewModel timerViewModel = getTimerViewModel();
        if (timerViewModel != null && (timerStates = timerViewModel.getTimerStates()) != null) {
            map = timerStates.getValue();
        }
        if (map == null) {
            map = U.c();
        }
        List<ButtonBinding> list = this.buttonBindings;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            TimerButtonConfig timerConfig = ((ButtonBinding) it.next()).getTimerConfig();
            if (timerConfig != null) {
                arrayList.add(timerConfig);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            TimerViewModel.TimerState timerState = map.get(((TimerButtonConfig) next).getTimerKey());
            if (timerState == null || !timerState.getIsActive()) {
                arrayList2.add(next);
            }
        }
        if (actionSignature != null) {
            ArrayList arrayList3 = new ArrayList();
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                Object next2 = it3.next();
                if (Intrinsics.d(((TimerButtonConfig) next2).getActionSignature(), actionSignature)) {
                    arrayList3.add(next2);
                }
            }
            if (arrayList3.isEmpty()) {
                return;
            }
            Iterator it4 = arrayList3.iterator();
            while (it4.hasNext()) {
                this.startedTimerKeys.add(((TimerButtonConfig) it4.next()).getTimerKey());
            }
            TimerViewModel timerViewModel2 = getTimerViewModel();
            if (timerViewModel2 != null) {
                int h11 = U.h(C7714v.z(arrayList3, 10));
                LinkedHashMap linkedHashMap = new LinkedHashMap(h11 >= 16 ? h11 : 16);
                Iterator it5 = arrayList3.iterator();
                while (it5.hasNext()) {
                    TimerButtonConfig timerButtonConfig = (TimerButtonConfig) it5.next();
                    Pair pair = new Pair(timerButtonConfig.getTimerKey(), Integer.valueOf(timerButtonConfig.getTotalSeconds()));
                    linkedHashMap.put(pair.e(), pair.f());
                }
                timerViewModel2.restartTimers(linkedHashMap);
            }
        } else if (id2 != null) {
            ArrayList arrayList4 = new ArrayList();
            Iterator it6 = arrayList2.iterator();
            while (it6.hasNext()) {
                Object next3 = it6.next();
                if (Intrinsics.d(((TimerButtonConfig) next3).getActionId(), id2)) {
                    arrayList4.add(next3);
                }
            }
            if (arrayList4.isEmpty()) {
                return;
            }
            Iterator it7 = arrayList4.iterator();
            while (it7.hasNext()) {
                this.startedTimerKeys.add(((TimerButtonConfig) it7.next()).getTimerKey());
            }
            TimerViewModel timerViewModel3 = getTimerViewModel();
            if (timerViewModel3 != null) {
                int h12 = U.h(C7714v.z(arrayList4, 10));
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(h12 >= 16 ? h12 : 16);
                Iterator it8 = arrayList4.iterator();
                while (it8.hasNext()) {
                    TimerButtonConfig timerButtonConfig2 = (TimerButtonConfig) it8.next();
                    Pair pair2 = new Pair(timerButtonConfig2.getTimerKey(), Integer.valueOf(timerButtonConfig2.getTotalSeconds()));
                    linkedHashMap2.put(pair2.e(), pair2.f());
                }
                timerViewModel3.restartTimers(linkedHashMap2);
            }
        } else {
            if (arrayList2.size() != 1) {
                return;
            }
            this.startedTimerKeys.add(((TimerButtonConfig) C7714v.K(arrayList2)).getTimerKey());
            TimerButtonConfig timerButtonConfig3 = (TimerButtonConfig) C7714v.K(arrayList2);
            TimerViewModel timerViewModel4 = getTimerViewModel();
            if (timerViewModel4 != null) {
                timerViewModel4.restartTimers(U.i(new Pair(timerButtonConfig3.getTimerKey(), Integer.valueOf(timerButtonConfig3.getTotalSeconds()))));
            }
        }
        syncAndRender();
    }
}
