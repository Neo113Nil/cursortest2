package ru.ozon.app.android.orders.cml.parcelTimeline.presentation.compose;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\bR\u0017\u0010\u0011\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0012\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/orders/cml/parcelTimeline/presentation/compose/ParcelTimelineConstants;", "", "<init>", "()V", "LZ1/h;", "CONNECTOR_WIDTH_DP", "F", "getCONNECTOR_WIDTH_DP-D9Ej5fM", "()F", "CONNECTOR_LENGTH_DP", "getCONNECTOR_LENGTH_DP-D9Ej5fM", "CONNECTOR_INTERVAL_DP", "getCONNECTOR_INTERVAL_DP-D9Ej5fM", "COLOR_POINT_SIZE_DP", "getCOLOR_POINT_SIZE_DP-D9Ej5fM", "CONTENT_PADDING_START_DP", "getCONTENT_PADDING_START_DP-D9Ej5fM", "CONTENT_PADDING_BOTTOM_DP", "getCONTENT_PADDING_BOTTOM_DP-D9Ej5fM", "orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class ParcelTimelineConstants {
    private static final float CONNECTOR_LENGTH_DP;
    private static final float CONNECTOR_WIDTH_DP;

    @NotNull
    public static final ParcelTimelineConstants INSTANCE = new ParcelTimelineConstants();
    private static final float CONNECTOR_INTERVAL_DP = 3;
    private static final float COLOR_POINT_SIZE_DP = 12;
    private static final float CONTENT_PADDING_START_DP = 36;
    private static final float CONTENT_PADDING_BOTTOM_DP = 10;

    static {
        float f7 = 2;
        CONNECTOR_WIDTH_DP = f7;
        CONNECTOR_LENGTH_DP = f7;
    }

    private ParcelTimelineConstants() {
    }

    /* renamed from: getCOLOR_POINT_SIZE_DP-D9Ej5fM, reason: not valid java name */
    public final float m865getCOLOR_POINT_SIZE_DPD9Ej5fM() {
        return COLOR_POINT_SIZE_DP;
    }

    /* renamed from: getCONNECTOR_INTERVAL_DP-D9Ej5fM, reason: not valid java name */
    public final float m866getCONNECTOR_INTERVAL_DPD9Ej5fM() {
        return CONNECTOR_INTERVAL_DP;
    }

    /* renamed from: getCONNECTOR_LENGTH_DP-D9Ej5fM, reason: not valid java name */
    public final float m867getCONNECTOR_LENGTH_DPD9Ej5fM() {
        return CONNECTOR_LENGTH_DP;
    }

    /* renamed from: getCONNECTOR_WIDTH_DP-D9Ej5fM, reason: not valid java name */
    public final float m868getCONNECTOR_WIDTH_DPD9Ej5fM() {
        return CONNECTOR_WIDTH_DP;
    }

    /* renamed from: getCONTENT_PADDING_BOTTOM_DP-D9Ej5fM, reason: not valid java name */
    public final float m869getCONTENT_PADDING_BOTTOM_DPD9Ej5fM() {
        return CONTENT_PADDING_BOTTOM_DP;
    }

    /* renamed from: getCONTENT_PADDING_START_DP-D9Ej5fM, reason: not valid java name */
    public final float m870getCONTENT_PADDING_START_DPD9Ej5fM() {
        return CONTENT_PADDING_START_DP;
    }
}
