package ne;

import android.graphics.Typeface;
import android.widget.TextView;
import com.sports.insider.ui.settings.SettingFragment;
import eg.z;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class d extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f20872b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SettingFragment f20873c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Typeface f20874d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(SettingFragment settingFragment, Typeface typeface, Continuation continuation, int i5) {
        super(2, continuation);
        this.f20872b = i5;
        this.f20873c = settingFragment;
        this.f20874d = typeface;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f20872b) {
            case 0:
                return new d(this.f20873c, this.f20874d, continuation, 0);
            default:
                return new d(this.f20873c, this.f20874d, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        z zVar = (z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f20872b) {
        }
        return ((d) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        TextView textView;
        TextView textView2;
        TextView textView3;
        TextView textView4;
        TextView textView5;
        TextView textView6;
        TextView textView7;
        TextView textView8;
        TextView textView9;
        TextView textView10;
        TextView textView11;
        TextView textView12;
        TextView textView13;
        TextView textView14;
        TextView textView15;
        TextView textView16;
        TextView textView17;
        TextView textView18;
        TextView textView19;
        int i5 = this.f20872b;
        SettingFragment settingFragment = this.f20873c;
        Typeface typeface = this.f20874d;
        switch (i5) {
            case 0:
                lf.a aVar = lf.a.f20034a;
                h8.b.B(obj);
                ec.z zVar = (ec.z) settingFragment.f22459a;
                if (zVar != null && (textView8 = zVar.D) != null) {
                    textView8.setTypeface(typeface);
                }
                ec.z zVar2 = (ec.z) settingFragment.f22459a;
                if (zVar2 != null && (textView7 = zVar2.B) != null) {
                    textView7.setTypeface(typeface);
                }
                ec.z zVar3 = (ec.z) settingFragment.f22459a;
                if (zVar3 != null && (textView6 = zVar3.f9077f) != null) {
                    textView6.setTypeface(typeface);
                }
                ec.z zVar4 = (ec.z) settingFragment.f22459a;
                if (zVar4 != null && (textView5 = zVar4.f9087r) != null) {
                    textView5.setTypeface(typeface);
                }
                ec.z zVar5 = (ec.z) settingFragment.f22459a;
                if (zVar5 != null && (textView4 = zVar5.f9091v) != null) {
                    textView4.setTypeface(typeface);
                }
                ec.z zVar6 = (ec.z) settingFragment.f22459a;
                if (zVar6 != null && (textView3 = zVar6.f9085o) != null) {
                    textView3.setTypeface(typeface);
                }
                ec.z zVar7 = (ec.z) settingFragment.f22459a;
                if (zVar7 != null && (textView2 = zVar7.j) != null) {
                    textView2.setTypeface(typeface);
                }
                ec.z zVar8 = (ec.z) settingFragment.f22459a;
                if (zVar8 != null && (textView = zVar8.E) != null) {
                    textView.setTypeface(typeface);
                }
                break;
            default:
                lf.a aVar2 = lf.a.f20034a;
                h8.b.B(obj);
                ec.z zVar9 = (ec.z) settingFragment.f22459a;
                if (zVar9 != null && (textView19 = zVar9.f9083m) != null) {
                    textView19.setTypeface(typeface);
                }
                ec.z zVar10 = (ec.z) settingFragment.f22459a;
                if (zVar10 != null && (textView18 = zVar10.C) != null) {
                    textView18.setTypeface(typeface);
                }
                ec.z zVar11 = (ec.z) settingFragment.f22459a;
                if (zVar11 != null && (textView17 = zVar11.f9095z) != null) {
                    textView17.setTypeface(typeface);
                }
                ec.z zVar12 = (ec.z) settingFragment.f22459a;
                if (zVar12 != null && (textView16 = zVar12.A) != null) {
                    textView16.setTypeface(typeface);
                }
                ec.z zVar13 = (ec.z) settingFragment.f22459a;
                if (zVar13 != null && (textView15 = zVar13.f9092w) != null) {
                    textView15.setTypeface(typeface);
                }
                ec.z zVar14 = (ec.z) settingFragment.f22459a;
                if (zVar14 != null && (textView14 = zVar14.f9076e) != null) {
                    textView14.setTypeface(typeface);
                }
                ec.z zVar15 = (ec.z) settingFragment.f22459a;
                if (zVar15 != null && (textView13 = zVar15.f9089t) != null) {
                    textView13.setTypeface(typeface);
                }
                ec.z zVar16 = (ec.z) settingFragment.f22459a;
                if (zVar16 != null && (textView12 = zVar16.f9088s) != null) {
                    textView12.setTypeface(typeface);
                }
                ec.z zVar17 = (ec.z) settingFragment.f22459a;
                if (zVar17 != null && (textView11 = zVar17.f9093x) != null) {
                    textView11.setTypeface(typeface);
                }
                ec.z zVar18 = (ec.z) settingFragment.f22459a;
                if (zVar18 != null && (textView10 = zVar18.f9090u) != null) {
                    textView10.setTypeface(typeface);
                }
                ec.z zVar19 = (ec.z) settingFragment.f22459a;
                if (zVar19 != null && (textView9 = zVar19.f9094y) != null) {
                    textView9.setTypeface(typeface);
                }
                break;
        }
        return Unit.f19194a;
    }
}
