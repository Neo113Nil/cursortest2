package com.horcrux.svg.events;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.events.Event;
import lb.C5444x;

/* loaded from: classes3.dex */
public class SvgOnLayoutEvent extends Event<SvgOnLayoutEvent> {
    public static final String EVENT_NAME = "topSvgLayout";
    public int height;
    public int width;

    /* renamed from: x, reason: collision with root package name */
    public int f38830x;

    /* renamed from: y, reason: collision with root package name */
    public int f38831y;

    public SvgOnLayoutEvent(int i10, int i11, int i12, int i13, int i14, int i15) {
        super(i10, i11);
        this.f38830x = i12;
        this.f38831y = i13;
        this.width = i14;
        this.height = i15;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public short getCoalescingKey() {
        return (short) 0;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public WritableMap getEventData() {
        WritableMap createMap = Arguments.createMap();
        createMap.putDouble(C5444x.f55808b, PixelUtil.toDIPFromPixel(this.f38830x));
        createMap.putDouble("y", PixelUtil.toDIPFromPixel(this.f38831y));
        createMap.putDouble("width", PixelUtil.toDIPFromPixel(this.width));
        createMap.putDouble("height", PixelUtil.toDIPFromPixel(this.height));
        WritableMap createMap2 = Arguments.createMap();
        createMap2.putMap("layout", createMap);
        createMap2.putInt("target", getViewTag());
        return createMap2;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public String getEventName() {
        return EVENT_NAME;
    }
}
