package com.vk.core.view.components.banner;

import com.vk.core.compose.generated.VkColorToken;
import kotlin.NoWhenBranchMatchedException;
import xsna.a8g;
import xsna.epx;
import xsna.gko;

/* compiled from: VkBanner.kt */
/* loaded from: classes17.dex */
public interface c {

    /* compiled from: VkBanner.kt */
    public static final class a implements c {
        public final gko a;
        public final a8g b;

        public a(gko gkoVar, VkBanner$Notification$Appearance vkBanner$Notification$Appearance) {
            a8g a8gVar;
            int i = b.$EnumSwitchMapping$0[vkBanner$Notification$Appearance.ordinal()];
            if (i == 1) {
                a8gVar = new a8g(VkColorToken.IconSecondary);
            } else if (i == 2) {
                a8gVar = new a8g(VkColorToken.IconWarning);
            } else if (i == 3) {
                a8gVar = new a8g(VkColorToken.IconNegative);
            } else {
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                a8gVar = new a8g(VkColorToken.IconPositive);
            }
            this.a = gkoVar;
            this.b = a8gVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b);
        }

        public final int hashCode() {
            int hashCode = Integer.hashCode(this.a.a) * 31;
            a8g a8gVar = this.b;
            return (hashCode + (a8gVar == null ? 0 : a8gVar.a.hashCode())) * 29791;
        }

        public final String toString() {
            return "Icon(icon=" + this.a + ", iconTint=" + this.b + ", iconSize=null, iconDescription=null, semanticsConfiguration=" + ((Object) "null") + ')';
        }
    }
}
