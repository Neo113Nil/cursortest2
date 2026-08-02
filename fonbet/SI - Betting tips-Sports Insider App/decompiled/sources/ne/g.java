package ne;

import com.sports.insider.ui.settings.SettingFragment;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class g extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f20882a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SettingFragment f20883b;

    /* renamed from: c, reason: collision with root package name */
    public int f20884c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(SettingFragment settingFragment, mf.c cVar) {
        super(cVar);
        this.f20883b = settingFragment;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f20882a = obj;
        this.f20884c |= Integer.MIN_VALUE;
        return SettingFragment.J(this.f20883b, this);
    }
}
