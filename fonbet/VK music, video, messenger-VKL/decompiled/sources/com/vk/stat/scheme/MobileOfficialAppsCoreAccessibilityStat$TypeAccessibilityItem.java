package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$EventBenchmarkMain;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MobileOfficialAppsCoreAccessibilityStat.kt */
/* loaded from: classes11.dex */
public final class MobileOfficialAppsCoreAccessibilityStat$TypeAccessibilityItem implements SchemeStat$EventBenchmarkMain.b {

    @pmi0("display")
    private final MobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityDisplay display;

    @pmi0("font")
    private final MobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityFont font;

    @pmi0("interaction")
    private final MobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityInteraction interaction;

    @pmi0("sound")
    private final MobileOfficialAppsCoreAccessibilityStat$CoreAccessibilitySound sound;

    public MobileOfficialAppsCoreAccessibilityStat$TypeAccessibilityItem() {
        this(null, null, null, null, 15, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsCoreAccessibilityStat$TypeAccessibilityItem)) {
            return false;
        }
        MobileOfficialAppsCoreAccessibilityStat$TypeAccessibilityItem mobileOfficialAppsCoreAccessibilityStat$TypeAccessibilityItem = (MobileOfficialAppsCoreAccessibilityStat$TypeAccessibilityItem) obj;
        return epx.f(this.display, mobileOfficialAppsCoreAccessibilityStat$TypeAccessibilityItem.display) && epx.f(this.font, mobileOfficialAppsCoreAccessibilityStat$TypeAccessibilityItem.font) && epx.f(this.interaction, mobileOfficialAppsCoreAccessibilityStat$TypeAccessibilityItem.interaction) && epx.f(this.sound, mobileOfficialAppsCoreAccessibilityStat$TypeAccessibilityItem.sound);
    }

    public final int hashCode() {
        MobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityDisplay mobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityDisplay = this.display;
        int hashCode = (mobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityDisplay == null ? 0 : mobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityDisplay.hashCode()) * 31;
        MobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityFont mobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityFont = this.font;
        int hashCode2 = (hashCode + (mobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityFont == null ? 0 : mobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityFont.hashCode())) * 31;
        MobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityInteraction mobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityInteraction = this.interaction;
        int hashCode3 = (hashCode2 + (mobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityInteraction == null ? 0 : mobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityInteraction.hashCode())) * 31;
        MobileOfficialAppsCoreAccessibilityStat$CoreAccessibilitySound mobileOfficialAppsCoreAccessibilityStat$CoreAccessibilitySound = this.sound;
        return hashCode3 + (mobileOfficialAppsCoreAccessibilityStat$CoreAccessibilitySound != null ? mobileOfficialAppsCoreAccessibilityStat$CoreAccessibilitySound.hashCode() : 0);
    }

    public final String toString() {
        return "TypeAccessibilityItem(display=" + this.display + ", font=" + this.font + ", interaction=" + this.interaction + ", sound=" + this.sound + ')';
    }

    public MobileOfficialAppsCoreAccessibilityStat$TypeAccessibilityItem(MobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityDisplay mobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityDisplay, MobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityFont mobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityFont, MobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityInteraction mobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityInteraction, MobileOfficialAppsCoreAccessibilityStat$CoreAccessibilitySound mobileOfficialAppsCoreAccessibilityStat$CoreAccessibilitySound) {
        this.display = mobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityDisplay;
        this.font = mobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityFont;
        this.interaction = mobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityInteraction;
        this.sound = mobileOfficialAppsCoreAccessibilityStat$CoreAccessibilitySound;
    }

    public /* synthetic */ MobileOfficialAppsCoreAccessibilityStat$TypeAccessibilityItem(MobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityDisplay mobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityDisplay, MobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityFont mobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityFont, MobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityInteraction mobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityInteraction, MobileOfficialAppsCoreAccessibilityStat$CoreAccessibilitySound mobileOfficialAppsCoreAccessibilityStat$CoreAccessibilitySound, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : mobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityDisplay, (i & 2) != 0 ? null : mobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityFont, (i & 4) != 0 ? null : mobileOfficialAppsCoreAccessibilityStat$CoreAccessibilityInteraction, (i & 8) != 0 ? null : mobileOfficialAppsCoreAccessibilityStat$CoreAccessibilitySound);
    }
}
