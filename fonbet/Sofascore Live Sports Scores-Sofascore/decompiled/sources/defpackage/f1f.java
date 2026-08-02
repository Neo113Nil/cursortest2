package defpackage;

import com.sofascore.model.firebase.SurveyConfigData;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class f1f extends j1f {
    public final SurveyConfigData h;
    public final boolean i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1f(SurveyConfigData surveyConfigData, boolean z) {
        super("Survey", j7f.c, new b1f(5), null, null, null, 120);
        surveyConfigData.getClass();
        this.h = surveyConfigData;
        this.i = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f1f)) {
            return false;
        }
        f1f f1fVar = (f1f) obj;
        return Intrinsics.c(this.h, f1fVar.h) && this.i == f1fVar.i;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.i) + (this.h.hashCode() * 31);
    }

    public final String toString() {
        return "Survey(surveyData=" + this.h + ", isInAppSurvey=" + this.i + ")";
    }
}
