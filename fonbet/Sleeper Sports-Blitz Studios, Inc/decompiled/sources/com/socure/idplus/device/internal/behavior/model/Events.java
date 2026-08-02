package com.socure.idplus.device.internal.behavior.model;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.react.uimanager.ViewProps;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001Bu\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0003\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0003\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0003\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0003¢\u0006\u0002\u0010\u0011J\u0011\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0003HÆ\u0003J\u0011\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0003HÆ\u0003J\u0087\u0001\u0010!\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00032\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00032\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00032\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00032\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020(HÖ\u0001R\u001e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u001e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u001e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u001e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u001e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u001e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013¨\u0006)"}, d2 = {"Lcom/socure/idplus/device/internal/behavior/model/Events;", "", "focusChangeEvents", "", "Lcom/socure/idplus/device/internal/behavior/model/FocusChangeEvent;", "inputChangeEvents", "Lcom/socure/idplus/device/internal/behavior/model/InputChangeEvent;", "keyPressEvents", "Lcom/socure/idplus/device/internal/behavior/model/KeyPressEvent;", ViewProps.POINTER_EVENTS, "Lcom/socure/idplus/device/internal/behavior/model/PointerEvent;", "locationEvents", "Lcom/socure/idplus/device/internal/behavior/model/LocationEvent;", "viewportSizeEvents", "Lcom/socure/idplus/device/internal/behavior/model/ViewportSizeEvent;", "lifeCycleEvents", "Lcom/socure/idplus/device/internal/behavior/model/LifeCycleEvent;", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getFocusChangeEvents", "()Ljava/util/List;", "getInputChangeEvents", "getKeyPressEvents", "getLifeCycleEvents", "getLocationEvents", "getPointerEvents", "getViewportSizeEvents", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "device-risk-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class Events {

    @SerializedName("focusChangeEvents")
    private final List<FocusChangeEvent> focusChangeEvents;

    @SerializedName("inputChangeEvents")
    private final List<InputChangeEvent> inputChangeEvents;

    @SerializedName("keyPressEvents")
    private final List<KeyPressEvent> keyPressEvents;

    @SerializedName("lifeCycleEvents")
    private final List<LifeCycleEvent> lifeCycleEvents;

    @SerializedName("locationEvents")
    private final List<LocationEvent> locationEvents;

    @SerializedName(ViewProps.POINTER_EVENTS)
    private final List<PointerEvent> pointerEvents;

    @SerializedName("viewportSizeEvents")
    private final List<ViewportSizeEvent> viewportSizeEvents;

    public Events(List<FocusChangeEvent> list, List<InputChangeEvent> list2, List<KeyPressEvent> list3, List<PointerEvent> list4, List<LocationEvent> list5, List<ViewportSizeEvent> list6, List<LifeCycleEvent> list7) {
        this.focusChangeEvents = list;
        this.inputChangeEvents = list2;
        this.keyPressEvents = list3;
        this.pointerEvents = list4;
        this.locationEvents = list5;
        this.viewportSizeEvents = list6;
        this.lifeCycleEvents = list7;
    }

    public static /* synthetic */ Events copy$default(Events events, List list, List list2, List list3, List list4, List list5, List list6, List list7, int i, Object obj) {
        if ((i & 1) != 0) {
            list = events.focusChangeEvents;
        }
        if ((i & 2) != 0) {
            list2 = events.inputChangeEvents;
        }
        if ((i & 4) != 0) {
            list3 = events.keyPressEvents;
        }
        if ((i & 8) != 0) {
            list4 = events.pointerEvents;
        }
        if ((i & 16) != 0) {
            list5 = events.locationEvents;
        }
        if ((i & 32) != 0) {
            list6 = events.viewportSizeEvents;
        }
        if ((i & 64) != 0) {
            list7 = events.lifeCycleEvents;
        }
        List list8 = list6;
        List list9 = list7;
        List list10 = list5;
        List list11 = list3;
        return events.copy(list, list2, list11, list4, list10, list8, list9);
    }

    public final List<FocusChangeEvent> component1() {
        return this.focusChangeEvents;
    }

    public final List<InputChangeEvent> component2() {
        return this.inputChangeEvents;
    }

    public final List<KeyPressEvent> component3() {
        return this.keyPressEvents;
    }

    public final List<PointerEvent> component4() {
        return this.pointerEvents;
    }

    public final List<LocationEvent> component5() {
        return this.locationEvents;
    }

    public final List<ViewportSizeEvent> component6() {
        return this.viewportSizeEvents;
    }

    public final List<LifeCycleEvent> component7() {
        return this.lifeCycleEvents;
    }

    public final Events copy(List<FocusChangeEvent> focusChangeEvents, List<InputChangeEvent> inputChangeEvents, List<KeyPressEvent> keyPressEvents, List<PointerEvent> pointerEvents, List<LocationEvent> locationEvents, List<ViewportSizeEvent> viewportSizeEvents, List<LifeCycleEvent> lifeCycleEvents) {
        return new Events(focusChangeEvents, inputChangeEvents, keyPressEvents, pointerEvents, locationEvents, viewportSizeEvents, lifeCycleEvents);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Events)) {
            return false;
        }
        Events events = (Events) other;
        return Intrinsics.areEqual(this.focusChangeEvents, events.focusChangeEvents) && Intrinsics.areEqual(this.inputChangeEvents, events.inputChangeEvents) && Intrinsics.areEqual(this.keyPressEvents, events.keyPressEvents) && Intrinsics.areEqual(this.pointerEvents, events.pointerEvents) && Intrinsics.areEqual(this.locationEvents, events.locationEvents) && Intrinsics.areEqual(this.viewportSizeEvents, events.viewportSizeEvents) && Intrinsics.areEqual(this.lifeCycleEvents, events.lifeCycleEvents);
    }

    public final List<FocusChangeEvent> getFocusChangeEvents() {
        return this.focusChangeEvents;
    }

    public final List<InputChangeEvent> getInputChangeEvents() {
        return this.inputChangeEvents;
    }

    public final List<KeyPressEvent> getKeyPressEvents() {
        return this.keyPressEvents;
    }

    public final List<LifeCycleEvent> getLifeCycleEvents() {
        return this.lifeCycleEvents;
    }

    public final List<LocationEvent> getLocationEvents() {
        return this.locationEvents;
    }

    public final List<PointerEvent> getPointerEvents() {
        return this.pointerEvents;
    }

    public final List<ViewportSizeEvent> getViewportSizeEvents() {
        return this.viewportSizeEvents;
    }

    public int hashCode() {
        List<FocusChangeEvent> list = this.focusChangeEvents;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<InputChangeEvent> list2 = this.inputChangeEvents;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<KeyPressEvent> list3 = this.keyPressEvents;
        int hashCode3 = (hashCode2 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<PointerEvent> list4 = this.pointerEvents;
        int hashCode4 = (hashCode3 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<LocationEvent> list5 = this.locationEvents;
        int hashCode5 = (hashCode4 + (list5 == null ? 0 : list5.hashCode())) * 31;
        List<ViewportSizeEvent> list6 = this.viewportSizeEvents;
        int hashCode6 = (hashCode5 + (list6 == null ? 0 : list6.hashCode())) * 31;
        List<LifeCycleEvent> list7 = this.lifeCycleEvents;
        return hashCode6 + (list7 != null ? list7.hashCode() : 0);
    }

    public String toString() {
        return "Events(focusChangeEvents=" + this.focusChangeEvents + ", inputChangeEvents=" + this.inputChangeEvents + ", keyPressEvents=" + this.keyPressEvents + ", pointerEvents=" + this.pointerEvents + ", locationEvents=" + this.locationEvents + ", viewportSizeEvents=" + this.viewportSizeEvents + ", lifeCycleEvents=" + this.lifeCycleEvents + ")";
    }
}
