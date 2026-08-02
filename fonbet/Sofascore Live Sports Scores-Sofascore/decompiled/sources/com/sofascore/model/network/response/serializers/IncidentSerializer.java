package com.sofascore.model.network.response.serializers;

import com.ironsource.U3;
import com.sofascore.model.mvvm.model.Incident;
import com.sofascore.model.mvvm.model.IncidentKt;
import defpackage.a70;
import defpackage.aik;
import defpackage.mfa;
import defpackage.qfa;
import defpackage.vfa;
import defpackage.zzl;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.d;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000bH\u0096\u0080\u0004J\u001a\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002H\u0096\u0080\u0004R\u0015\u0010\u0005\u001a\u00020\u0006X\u0096\u0084\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0011"}, d2 = {"Lcom/sofascore/model/network/response/serializers/IncidentSerializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/mvvm/model/Incident;", "<init>", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", U3.i.X, "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class IncidentSerializer implements KSerializer {

    @NotNull
    public static final IncidentSerializer INSTANCE = new IncidentSerializer();

    @NotNull
    private static final SerialDescriptor descriptor = aik.v("Incident", new SerialDescriptor[0]);

    private IncidentSerializer() {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0078, code lost:
    
        if (r0.equals(com.sofascore.model.mvvm.model.IncidentKt.TYPE_PENALTY_SHOOTOUT) == false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0098, code lost:
    
        return (com.sofascore.model.mvvm.model.Incident) r15.d().a(com.sofascore.model.mvvm.model.Incident.PenaltyShotIncident.INSTANCE.serializer(), r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0082, code lost:
    
        if (r0.equals(com.sofascore.model.mvvm.model.IncidentKt.TYPE_PENALTY_IN_GAME) == false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00d9, code lost:
    
        if (r0.equals(com.sofascore.model.mvvm.model.IncidentKt.TYPE_UDRS) == false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0131, code lost:
    
        return (com.sofascore.model.mvvm.model.Incident) r15.d().a(com.sofascore.model.mvvm.model.Incident.CricketIncident.INSTANCE.serializer(), r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x011c, code lost:
    
        if (r0.equals(com.sofascore.model.mvvm.model.IncidentKt.TYPE_BALL) == false) goto L73;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    @Override // defpackage.dy4
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Incident deserialize(@NotNull Decoder decoder) {
        decoder.getClass();
        String str = null;
        mfa mfaVar = decoder instanceof mfa ? (mfa) decoder : null;
        if (mfaVar == null) {
            a70.r("Can be deserialized only by JSON");
            return null;
        }
        b j = mfaVar.j();
        b bVar = (b) qfa.g(j).get("incidentType");
        if (bVar != null) {
            d h = qfa.h(bVar);
            if (!(h instanceof JsonNull)) {
                str = h.c();
            }
        }
        if (str != null) {
            switch (str.hashCode()) {
                case -991726143:
                    if (str.equals("period")) {
                        return (Incident) mfaVar.d().a(Incident.PeriodIncident.INSTANCE.serializer(), j);
                    }
                    break;
                case -514450716:
                    if (str.equals(IncidentKt.TYPE_INJURY_TIME)) {
                        return (Incident) mfaVar.d().a(Incident.InjuryTimeIncident.INSTANCE.serializer(), j);
                    }
                    break;
                case 3016191:
                    break;
                case 3046160:
                    if (str.equals(IncidentKt.TYPE_CARD)) {
                        return (Incident) mfaVar.d().a(Incident.CardIncident.INSTANCE.serializer(), j);
                    }
                    break;
                case 3178259:
                    if (str.equals("goal")) {
                        return (Incident) mfaVar.d().a(Incident.GoalIncident.INSTANCE.serializer(), j);
                    }
                    break;
                case 3585296:
                    break;
                case 29560797:
                    if (str.equals(IncidentKt.TYPE_SUSPENSION)) {
                        return (Incident) mfaVar.d().a(Incident.SuspensionIncident.INSTANCE.serializer(), j);
                    }
                    break;
                case 826147581:
                    if (str.equals(IncidentKt.TYPE_SUBSTITUTION)) {
                        return (Incident) mfaVar.d().a(Incident.SubstitutionIncident.INSTANCE.serializer(), j);
                    }
                    break;
                case 1423307218:
                    break;
                case 1484572280:
                    break;
                case 1565148195:
                    if (str.equals(IncidentKt.TYPE_VAR_DECISION)) {
                        return (Incident) mfaVar.d().a(Incident.VarDecisionIncident.INSTANCE.serializer(), j);
                    }
                    break;
                case 2117517278:
                    if (str.equals(IncidentKt.TYPE_OVERTIME_BREAK)) {
                        return (Incident) mfaVar.d().a(Incident.OvertimeBreakIncident.INSTANCE.serializer(), j);
                    }
                    break;
            }
        }
        return new Incident.UnknownIncident((String) null, (Integer) null, (Boolean) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 2047, (DefaultConstructorMarker) null);
    }

    @Override // defpackage.dy4
    @NotNull
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public void serialize(@NotNull Encoder encoder, @NotNull Incident value) {
        encoder.getClass();
        value.getClass();
        vfa vfaVar = encoder instanceof vfa ? (vfa) encoder : null;
        if (vfaVar == null) {
            a70.r("Can be serialized only to JSON");
            return;
        }
        if (value instanceof Incident.GoalIncident) {
            vfaVar.l(Incident.GoalIncident.INSTANCE.serializer(), value);
            return;
        }
        if (value instanceof Incident.CardIncident) {
            vfaVar.l(Incident.CardIncident.INSTANCE.serializer(), value);
            return;
        }
        if (value instanceof Incident.SubstitutionIncident) {
            vfaVar.l(Incident.SubstitutionIncident.INSTANCE.serializer(), value);
            return;
        }
        if (value instanceof Incident.PeriodIncident) {
            vfaVar.l(Incident.PeriodIncident.INSTANCE.serializer(), value);
            return;
        }
        if (value instanceof Incident.OvertimeBreakIncident) {
            vfaVar.l(Incident.OvertimeBreakIncident.INSTANCE.serializer(), value);
            return;
        }
        if (value instanceof Incident.PenaltyShotIncident) {
            vfaVar.l(Incident.PenaltyShotIncident.INSTANCE.serializer(), value);
            return;
        }
        if (value instanceof Incident.VarDecisionIncident) {
            vfaVar.l(Incident.VarDecisionIncident.INSTANCE.serializer(), value);
            return;
        }
        if (value instanceof Incident.InjuryTimeIncident) {
            vfaVar.l(Incident.InjuryTimeIncident.INSTANCE.serializer(), value);
            return;
        }
        if (value instanceof Incident.CricketIncident) {
            vfaVar.l(Incident.CricketIncident.INSTANCE.serializer(), value);
            return;
        }
        if (value instanceof Incident.SuspensionIncident) {
            vfaVar.l(Incident.SuspensionIncident.INSTANCE.serializer(), value);
        } else if (value instanceof Incident.UnknownIncident) {
            vfaVar.l(Incident.UnknownIncident.INSTANCE.serializer(), value);
        } else {
            zzl.b();
        }
    }
}
