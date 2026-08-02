package com.vk.superapp.ui.uniwidgets.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.superapp.api.dto.menu.QueueSettings;
import com.vk.superapp.api.dto.menu.WidgetIds;
import com.vk.superapp.api.dto.menu.WidgetSettings;
import com.vk.superapp.api.dto.widgets.actions.WebAction;
import com.vk.superapp.ui.uniwidgets.blocks.BaseBlock;
import com.vk.superapp.ui.uniwidgets.blocks.ImageBlock;
import com.vk.superapp.ui.uniwidgets.blocks.ScrollItemBlock;
import com.vk.superapp.ui.widgets.SuperAppWidget;
import com.vk.superapp.ui.widgets.WidgetBasePayload;
import java.util.List;
import xsna.bzk0;
import xsna.epx;
import xsna.fw3;
import xsna.gq;
import xsna.urd0;
import xsna.xq;

/* compiled from: ScrollUniWidget.kt */
/* loaded from: classes6.dex */
public final class ScrollUniWidget extends UniversalWidget {
    public static final a CREATOR = new a();
    public final WidgetIds m;
    public final String n;
    public final QueueSettings o;
    public final WidgetSettings p;
    public final String q;
    public final Payload r;
    public final BaseBlock s;
    public final ScrollItemBlock.Style t;
    public final List<ScrollItemBlock> u;
    public final BaseBlock v;
    public final ImageBlock w;

    /* compiled from: ScrollUniWidget.kt */
    public static final class a implements Parcelable.Creator<ScrollUniWidget> {
        @Override // android.os.Parcelable.Creator
        public final ScrollUniWidget createFromParcel(Parcel parcel) {
            return new ScrollUniWidget(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final ScrollUniWidget[] newArray(int i) {
            return new ScrollUniWidget[i];
        }
    }

    public ScrollUniWidget(Parcel parcel) {
        this((WidgetIds) parcel.readParcelable(WidgetIds.class.getClassLoader()), parcel.readString(), (QueueSettings) parcel.readParcelable(QueueSettings.class.getClassLoader()), (WidgetSettings) parcel.readParcelable(WidgetSettings.class.getClassLoader()), parcel.readString(), (Payload) parcel.readParcelable(Payload.class.getClassLoader()));
    }

    @Override // com.vk.superapp.ui.widgets.SuperAppWidget
    public final SuperAppWidget b(boolean z) {
        return new ScrollUniWidget(this.m, this.n, this.o, new WidgetSettings(z, this.p.c, false, false, 12, null), this.q, this.r);
    }

    @Override // com.vk.superapp.ui.uniwidgets.dto.UniversalWidget, com.vk.superapp.ui.widgets.SuperAppWidget
    public final WidgetIds d() {
        return this.m;
    }

    @Override // com.vk.superapp.ui.widgets.SuperAppWidget, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.vk.superapp.ui.widgets.SuperAppWidget
    public final WidgetSettings e() {
        return this.p;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScrollUniWidget)) {
            return false;
        }
        ScrollUniWidget scrollUniWidget = (ScrollUniWidget) obj;
        return epx.f(this.m, scrollUniWidget.m) && epx.f(this.n, scrollUniWidget.n) && epx.f(this.o, scrollUniWidget.o) && epx.f(this.p, scrollUniWidget.p) && epx.f(this.q, scrollUniWidget.q) && epx.f(this.r, scrollUniWidget.r);
    }

    @Override // com.vk.superapp.ui.widgets.SuperAppWidget
    public final String getType() {
        return this.n;
    }

    public final int hashCode() {
        return this.r.hashCode() + urd0.a(xq.b(this.p, bzk0.a(this.o, urd0.a(this.m.hashCode() * 31, 31, this.n), 31), 31), 31, this.q);
    }

    public final String toString() {
        return "ScrollUniWidget(ids=" + this.m + ", type=" + this.n + ", queueSettings=" + this.o + ", settings=" + this.p + ", actionTitle=" + this.q + ", payload=" + this.r + ')';
    }

    @Override // com.vk.superapp.ui.widgets.SuperAppWidget, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.m, i);
        parcel.writeString(this.n);
        parcel.writeParcelable(this.o, i);
        parcel.writeParcelable(this.p, i);
        parcel.writeString(this.q);
        parcel.writeParcelable(this.r, i);
    }

    /* compiled from: ScrollUniWidget.kt */
    public static final class Payload implements Parcelable {
        public static final a CREATOR = new a();
        public final WebAction b;
        public final BaseBlock c;
        public final ScrollItemBlock.Style d;
        public final List<ScrollItemBlock> e;
        public final BaseBlock f;
        public final WidgetBasePayload g;

        /* compiled from: ScrollUniWidget.kt */
        public static final class a implements Parcelable.Creator<Payload> {
            @Override // android.os.Parcelable.Creator
            public final Payload createFromParcel(Parcel parcel) {
                return new Payload(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final Payload[] newArray(int i) {
                return new Payload[i];
            }
        }

        public Payload(WebAction webAction, BaseBlock baseBlock, ScrollItemBlock.Style style, List<ScrollItemBlock> list, BaseBlock baseBlock2, WidgetBasePayload widgetBasePayload) {
            this.b = webAction;
            this.c = baseBlock;
            this.d = style;
            this.e = list;
            this.f = baseBlock2;
            this.g = widgetBasePayload;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Payload)) {
                return false;
            }
            Payload payload = (Payload) obj;
            return epx.f(this.b, payload.b) && epx.f(this.c, payload.c) && epx.f(this.d, payload.d) && epx.f(this.e, payload.e) && epx.f(this.f, payload.f) && epx.f(this.g, payload.g);
        }

        public final int hashCode() {
            WebAction webAction = this.b;
            return this.g.hashCode() + ((this.f.hashCode() + fw3.a((this.d.hashCode() + ((this.c.hashCode() + ((webAction == null ? 0 : webAction.hashCode()) * 31)) * 31)) * 31, 31, this.e)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Payload(action=");
            sb.append(this.b);
            sb.append(", header=");
            sb.append(this.c);
            sb.append(", style=");
            sb.append(this.d);
            sb.append(", blocks=");
            sb.append(this.e);
            sb.append(", footer=");
            sb.append(this.f);
            sb.append(", basePayload=");
            return gq.f(sb, this.g, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.b, i);
            parcel.writeParcelable(this.c, i);
            parcel.writeParcelable(this.d, i);
            parcel.writeTypedList(this.e);
            parcel.writeParcelable(this.f, i);
            parcel.writeParcelable(this.g, i);
        }

        public Payload(Parcel parcel) {
            this((WebAction) parcel.readParcelable(WebAction.class.getClassLoader()), (BaseBlock) parcel.readParcelable(BaseBlock.class.getClassLoader()), (ScrollItemBlock.Style) parcel.readParcelable(ScrollItemBlock.Style.class.getClassLoader()), parcel.createTypedArrayList(ScrollItemBlock.CREATOR), (BaseBlock) parcel.readParcelable(BaseBlock.class.getClassLoader()), (WidgetBasePayload) parcel.readParcelable(WidgetBasePayload.class.getClassLoader()));
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public ScrollUniWidget(com.vk.superapp.api.dto.menu.WidgetIds r15, java.lang.String r16, com.vk.superapp.api.dto.menu.QueueSettings r17, com.vk.superapp.api.dto.menu.WidgetSettings r18, java.lang.String r19, com.vk.superapp.ui.uniwidgets.dto.ScrollUniWidget.Payload r20) {
        /*
            r14 = this;
            r0 = r20
            com.vk.superapp.ui.widgets.WidgetBasePayload r1 = r0.g
            java.lang.String r5 = r1.b
            double r8 = r1.c
            com.vk.superapp.api.dto.widgets.actions.WebAction r10 = r0.b
            com.vk.superapp.ui.widgets.AdditionalHeaderIconBlock r2 = r1.e
            r13 = 0
            if (r2 == 0) goto L1d
            com.vk.superapp.api.dto.widgets.actions.WebAction r2 = r2.c
            r11 = r2
            r3 = r15
            r4 = r16
            r6 = r17
            r7 = r18
            r12 = r19
            r2 = r14
            goto L28
        L1d:
            r11 = r13
            r2 = r14
            r3 = r15
            r4 = r16
            r6 = r17
            r7 = r18
            r12 = r19
        L28:
            r2.<init>(r3, r4, r5, r6, r7, r8, r10, r11, r12)
            r14.m = r15
            r4 = r16
            r14.n = r4
            r6 = r17
            r14.o = r6
            r7 = r18
            r14.p = r7
            r12 = r19
            r14.q = r12
            r14.r = r0
            com.vk.superapp.ui.uniwidgets.blocks.BaseBlock r15 = r0.c
            r14.s = r15
            com.vk.superapp.ui.uniwidgets.blocks.ScrollItemBlock$Style r15 = r0.d
            r14.t = r15
            java.util.List<com.vk.superapp.ui.uniwidgets.blocks.ScrollItemBlock> r15 = r0.e
            r14.u = r15
            com.vk.superapp.ui.uniwidgets.blocks.BaseBlock r15 = r0.f
            r14.v = r15
            com.vk.superapp.ui.uniwidgets.blocks.ImageBlock r3 = new com.vk.superapp.ui.uniwidgets.blocks.ImageBlock
            com.vk.superapp.ui.widgets.AdditionalHeaderIconBlock r15 = r1.e
            if (r15 == 0) goto L59
            com.vk.external.miniapp.net.app.WebImage r15 = r15.b
            r4 = r15
            goto L5a
        L59:
            r4 = r13
        L5a:
            com.vk.superapp.ui.uniwidgets.blocks.ImageBlock$Style r15 = new com.vk.superapp.ui.uniwidgets.blocks.ImageBlock$Style
            com.vk.superapp.ui.uniwidgets.blocks.ImageBlock$Style$Size r0 = com.vk.superapp.ui.uniwidgets.blocks.ImageBlock.Style.Size.SMALL
            r5 = 6
            r6 = 0
            r7 = 0
            r8 = 0
            r16 = r0
            r19 = r5
            r20 = r6
            r17 = r7
            r18 = r8
            r15.<init>(r16, r17, r18, r19, r20)
            com.vk.superapp.ui.widgets.AdditionalHeaderIconBlock r0 = r1.e
            if (r0 == 0) goto L75
            com.vk.superapp.api.dto.widgets.actions.WebAction r13 = r0.c
        L75:
            r6 = r13
            r8 = 8
            r9 = 0
            r7 = 0
            r5 = r15
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r14.w = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vk.superapp.ui.uniwidgets.dto.ScrollUniWidget.<init>(com.vk.superapp.api.dto.menu.WidgetIds, java.lang.String, com.vk.superapp.api.dto.menu.QueueSettings, com.vk.superapp.api.dto.menu.WidgetSettings, java.lang.String, com.vk.superapp.ui.uniwidgets.dto.ScrollUniWidget$Payload):void");
    }
}
