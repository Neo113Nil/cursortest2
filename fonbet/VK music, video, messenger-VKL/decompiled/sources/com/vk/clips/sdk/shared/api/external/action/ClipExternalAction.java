package com.vk.clips.sdk.shared.api.external.action;

import defpackage.q0;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.zrp;

/* compiled from: ClipExternalUpdateEvent.kt */
/* loaded from: classes17.dex */
public interface ClipExternalAction {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ClipExternalUpdateEvent.kt */
    public static final class ShowActionButton implements ClipExternalAction {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ShowActionButton[] $VALUES;
        public static final ShowActionButton ACTIVE;
        public static final ShowActionButton INACTIVE;

        static {
            ShowActionButton showActionButton = new ShowActionButton(SignalingProtocol.STATE_ACTIVE, 0);
            ACTIVE = showActionButton;
            ShowActionButton showActionButton2 = new ShowActionButton("INACTIVE", 1);
            INACTIVE = showActionButton2;
            ShowActionButton[] showActionButtonArr = {showActionButton, showActionButton2};
            $VALUES = showActionButtonArr;
            $ENTRIES = new asp(showActionButtonArr);
        }

        public ShowActionButton() {
            throw null;
        }

        public static ShowActionButton valueOf(String str) {
            return (ShowActionButton) Enum.valueOf(ShowActionButton.class, str);
        }

        public static ShowActionButton[] values() {
            return (ShowActionButton[]) $VALUES.clone();
        }
    }

    /* compiled from: ClipExternalUpdateEvent.kt */
    public static final class a implements ClipExternalAction {
        public final boolean b;
        public final boolean c;

        public a(boolean z, boolean z2) {
            this.b = z;
            this.c = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.b == aVar.b && this.c == aVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + (Boolean.hashCode(this.b) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("NewsFeedMarketItemsState(itemsIsVisible=");
            sb.append(this.b);
            sb.append(", itemsWasShown=");
            return q0.a(sb, this.c, ')');
        }
    }
}
