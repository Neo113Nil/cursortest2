package com.vk.im.reporters.api.dialog;

import com.fyber.inneractive.sdk.external.NativeAdContent;
import xsna.asp;
import xsna.eik0;
import xsna.mdz;
import xsna.zrp;

/* compiled from: OpenChatListReporter.kt */
/* loaded from: classes2.dex */
public interface OpenChatListReporter extends eik0<mdz<Span>, MeasuringPoint> {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: OpenChatListReporter.kt */
    public static final class MeasuringPoint {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ MeasuringPoint[] $VALUES;
        public static final MeasuringPoint RESUMED;

        static {
            MeasuringPoint measuringPoint = new MeasuringPoint("RESUMED", 0);
            RESUMED = measuringPoint;
            MeasuringPoint[] measuringPointArr = {measuringPoint};
            $VALUES = measuringPointArr;
            $ENTRIES = new asp(measuringPointArr);
        }

        public MeasuringPoint() {
            throw null;
        }

        public static MeasuringPoint valueOf(String str) {
            return (MeasuringPoint) Enum.valueOf(MeasuringPoint.class, str);
        }

        public static MeasuringPoint[] values() {
            return (MeasuringPoint[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: OpenChatListReporter.kt */
    public static final class Span {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Span[] $VALUES;
        public static final Span APP_CREATE;
        public static final Span DIALOGS_ADAPTER_RENDER;
        public static final Span LOADER_SPINNER;
        public static final Span LOAD_DIALOGS;
        public static final Span LOAD_FOLDERS;
        public static final Span ON_CREATE;
        public static final Span ON_CREATE_VIEW;
        public static final Span ROOT;
        private final String value;

        static {
            Span span = new Span(NativeAdContent.ViewTag.ROOT, 0, "root");
            ROOT = span;
            Span span2 = new Span("APP_CREATE", 1, "app_create");
            APP_CREATE = span2;
            Span span3 = new Span("ON_CREATE", 2, "on_create");
            ON_CREATE = span3;
            Span span4 = new Span("ON_CREATE_VIEW", 3, "on_create_view");
            ON_CREATE_VIEW = span4;
            Span span5 = new Span("LOAD_FOLDERS", 4, "load_folders");
            LOAD_FOLDERS = span5;
            Span span6 = new Span("LOAD_DIALOGS", 5, "load_dialogs");
            LOAD_DIALOGS = span6;
            Span span7 = new Span("DIALOGS_ADAPTER_RENDER", 6, "adapter_render");
            DIALOGS_ADAPTER_RENDER = span7;
            Span span8 = new Span("LOADER_SPINNER", 7, "loader_spinner");
            LOADER_SPINNER = span8;
            Span[] spanArr = {span, span2, span3, span4, span5, span6, span7, span8};
            $VALUES = spanArr;
            $ENTRIES = new asp(spanArr);
        }

        public Span(String str, int i, String str2) {
            this.value = str2;
        }

        public static Span valueOf(String str) {
            return (Span) Enum.valueOf(Span.class, str);
        }

        public static Span[] values() {
            return (Span[]) $VALUES.clone();
        }

        public final String h() {
            return this.value;
        }
    }
}
