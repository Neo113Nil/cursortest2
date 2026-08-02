package com.blaze.blazesdk.widgets.models;

import com.blaze.blazesdk.widgets.models.WidgetItemImageStyleRemoteDto;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class b {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[WidgetItemImageStyleRemoteDto.BlazeThumbnailTypeDto.values().length];
        try {
            iArr[WidgetItemImageStyleRemoteDto.BlazeThumbnailTypeDto.SQUARE_ICON.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[WidgetItemImageStyleRemoteDto.BlazeThumbnailTypeDto.VERTICAL_TWO_BY_THREE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[WidgetItemImageStyleRemoteDto.BlazeThumbnailTypeDto.CUSTOM.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
        int[] iArr2 = new int[WidgetItemImageStyleRemoteDto.BlazeWidgetPositionDto.values().length];
        try {
            iArr2[WidgetItemImageStyleRemoteDto.BlazeWidgetPositionDto.TOP_START.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[WidgetItemImageStyleRemoteDto.BlazeWidgetPositionDto.TOP_CENTER.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[WidgetItemImageStyleRemoteDto.BlazeWidgetPositionDto.TOP_END.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[WidgetItemImageStyleRemoteDto.BlazeWidgetPositionDto.CENTER_START.ordinal()] = 4;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[WidgetItemImageStyleRemoteDto.BlazeWidgetPositionDto.CENTER.ordinal()] = 5;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[WidgetItemImageStyleRemoteDto.BlazeWidgetPositionDto.CENTER_END.ordinal()] = 6;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[WidgetItemImageStyleRemoteDto.BlazeWidgetPositionDto.BOTTOM_START.ordinal()] = 7;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[WidgetItemImageStyleRemoteDto.BlazeWidgetPositionDto.BOTTOM_CENTER.ordinal()] = 8;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[WidgetItemImageStyleRemoteDto.BlazeWidgetPositionDto.BOTTOM_END.ordinal()] = 9;
        } catch (NoSuchFieldError unused12) {
        }
        b = iArr2;
    }
}
