package kotlin.reflect.jvm.internal.impl.load.java;

import defpackage.xbb;
import defpackage.xka;
import java.util.Map;
import kotlin.collections.a;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class Jsr305Settings$description$2 extends xka implements Function0<String[]> {
    final /* synthetic */ Jsr305Settings this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Jsr305Settings$description$2(Jsr305Settings jsr305Settings) {
        super(0);
        this.this$0 = jsr305Settings;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final String[] invoke() {
        Jsr305Settings jsr305Settings = this.this$0;
        xbb b = a.b();
        b.add(jsr305Settings.getGlobalLevel().getDescription());
        ReportLevel migrationLevel = jsr305Settings.getMigrationLevel();
        if (migrationLevel != null) {
            b.add("under-migration:" + migrationLevel.getDescription());
        }
        for (Map.Entry<FqName, ReportLevel> entry : jsr305Settings.getUserDefinedLevelForSpecificAnnotation().entrySet()) {
            b.add("@" + entry.getKey() + ':' + entry.getValue().getDescription());
        }
        return (String[]) a.a(b).toArray(new String[0]);
    }
}
