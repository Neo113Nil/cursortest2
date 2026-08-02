package ce;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String[] f3837a = {"", "Откройте приложение \"Sports Insider\" на вашем устройстве", "В правом верхнем углу нажмите на значок Настройки ⚙", "Выберите пункт Учетная запись", "В открывшемся окне подтвердите действие, нажмите Да."};

    /* renamed from: b, reason: collision with root package name */
    public final String[] f3838b = {"", "", "Настройки", "Учетная запись", "Да"};

    /* renamed from: c, reason: collision with root package name */
    public final String[] f3839c = {"", "Ouvrez l’application « Sports Insider » sur votre appareil.", "En haut à droite, touchez l’icône Paramètres ⚙", "Sélectionnez l’élément Compte.", "Dans la fenêtre qui s’ouvre, touchez Oui pour confirmer l’action."};

    /* renamed from: d, reason: collision with root package name */
    public final String[] f3840d = {"", "", "Paramètres", "Compte", "Oui"};

    /* renamed from: e, reason: collision with root package name */
    public final String[] f3841e = {"", "Öffnen Sie die App „Sports Insider“ auf Ihrem Gerät.", "Tippen Sie oben rechts auf das Symbol Einstellungen ⚙", "Wählen Sie den Punkt Konto.", "Im angezeigten Fenster tippen Sie zur Bestätigung auf Ja."};

    /* renamed from: f, reason: collision with root package name */
    public final String[] f3842f = {"", "", "Einstellungen", "Konto", "Ja"};

    /* renamed from: g, reason: collision with root package name */
    public final String[] f3843g = {"", "Abre la aplicación “Sports Insider” en tu dispositivo.", "En la esquina superior derecha, toca el ícono de Configuración ⚙", "Selecciona el elemento Cuenta.", "En la ventana que se abre, toca Sí para confirmar la acción."};

    /* renamed from: h, reason: collision with root package name */
    public final String[] f3844h = {"", "", "Configuración", "Cuenta", "Sí"};

    /* renamed from: i, reason: collision with root package name */
    public final String[] f3845i = {"", "Abre a aplicação “Sports Insider” no teu dispositivo.", "No canto superior direito, toca no ícone Definições ⚙", "Seleciona o item Conta.", "Na janela que se abre, toca em Sim para confirmar a ação."};
    public final String[] j = {"", "", "Definições", "Conta", "Sim"};

    /* renamed from: k, reason: collision with root package name */
    public final String[] f3846k = {"", "Cihazınızda “Sports Insider” uygulamasını açın.", "Sağ üst köşedeki Ayarlar simgesine dokunun ⚙", "Hesap öğesini seçin.", "Açılan pencerede işlemi onaylamak için Evet’e dokunun."};

    /* renamed from: l, reason: collision with root package name */
    public final String[] f3847l = {"", "", "Ayarlar", "Hesap", "Evet"};

    /* renamed from: m, reason: collision with root package name */
    public final String[] f3848m = {"", "Open “Sports Insider” app on your device", "In the top right corner, tap the Settings icon ⚙", "Select an item Account", "In the window that opens, to confirm action, tap Yes."};

    /* renamed from: n, reason: collision with root package name */
    public final String[] f3849n = {"", "", "Settings", "Account", "Yes"};

    public final String a(int i5, String language) {
        String[] strArr;
        Intrinsics.checkNotNullParameter(language, "language");
        int hashCode = language.hashCode();
        if (hashCode == 3201) {
            if (language.equals("de")) {
                strArr = this.f3841e;
            }
            strArr = this.f3848m;
        } else if (hashCode == 3246) {
            if (language.equals("es")) {
                strArr = this.f3843g;
            }
            strArr = this.f3848m;
        } else if (hashCode == 3276) {
            if (language.equals("fr")) {
                strArr = this.f3839c;
            }
            strArr = this.f3848m;
        } else if (hashCode == 3588) {
            if (language.equals("pt")) {
                strArr = this.f3845i;
            }
            strArr = this.f3848m;
        } else if (hashCode != 3651) {
            if (hashCode == 3710 && language.equals("tr")) {
                strArr = this.f3846k;
            }
            strArr = this.f3848m;
        } else {
            if (language.equals("ru")) {
                strArr = this.f3837a;
            }
            strArr = this.f3848m;
        }
        int i10 = i5 - 1;
        return (i10 >= strArr.length || i10 < 0) ? "" : strArr[i10];
    }

    public final String b(int i5, String language) {
        String[] strArr;
        Intrinsics.checkNotNullParameter(language, "language");
        int hashCode = language.hashCode();
        if (hashCode == 3201) {
            if (language.equals("de")) {
                strArr = this.f3842f;
            }
            strArr = this.f3849n;
        } else if (hashCode == 3246) {
            if (language.equals("es")) {
                strArr = this.f3844h;
            }
            strArr = this.f3849n;
        } else if (hashCode == 3276) {
            if (language.equals("fr")) {
                strArr = this.f3840d;
            }
            strArr = this.f3849n;
        } else if (hashCode == 3588) {
            if (language.equals("pt")) {
                strArr = this.j;
            }
            strArr = this.f3849n;
        } else if (hashCode != 3651) {
            if (hashCode == 3710 && language.equals("tr")) {
                strArr = this.f3847l;
            }
            strArr = this.f3849n;
        } else {
            if (language.equals("ru")) {
                strArr = this.f3838b;
            }
            strArr = this.f3849n;
        }
        int i10 = i5 - 1;
        return (i10 >= strArr.length || i10 < 0) ? "" : strArr[i10];
    }
}
