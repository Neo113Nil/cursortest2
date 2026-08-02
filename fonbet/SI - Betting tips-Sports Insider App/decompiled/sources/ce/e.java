package ce;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String[] f3857a = {"Друзья, всем привет!", "Недавно Google Play приостановил прием платежей для пользователей из России. Поэтому у некоторых пользователей теперь могут появиться проблемы с оплатой подписки или отдельной покупки прогноза. ", "Но, как и в борьбе с букмекерами, мы и тут на шаг впереди! Возможность приобрести наши прогнозы все равно есть. И это абсолютно безопасный и простой способ.", "Если у вас не проходит оплата, то необходимо сделать следующее: ", "обновить приложение до последней версии (зайти в Google Market, найти наше приложение и нажать «Обновить»);", "после обновления выбрать необходимый продукт, который вы хотели приобрести;", "при попытке приобрести снова выйдет окно с ошибкой оплаты, но сразу же после неудачной попытки приобрести прогноз или подписку, у вас в приложении откроется новое окно;", "в данном окне необходимо будет ввести данные вашей карты (все данные, которые вы вводите защищены шифрованием, мы не имеем к ним доступ, и они никогда не будут переданы третьим лицам). Оплата будет происходит через сервис Cloud Payments – это абсолютно прозрачная и легальная платежная система, которая существует на рынке уже более 15 лет.", "После этого прогноз/подписка будет уже активна на вашем устройстве.", "Наши прогнозы выходят в том же объеме и с той же высокой проходимостью. Ставьте с нами и выигрывайте."};

    /* renamed from: b, reason: collision with root package name */
    public final String[] f3858b = {"You can subscribe to services and pay for an individual product through Google Play. To do this, the user must have a bank/virtual card or other payment method added to his Google Play account.", "You can purchase apps and digital content on Google Play using payment methods from your Google account. If it\\'s your first time making a purchase, your payment method will be added to your Google account. You can add the following credit/debit cards to your account: American Express, Discover, JCB, MasterCard, Visa and Visa Electron", "To add a payment method to google play, use this instruction", "https://support.google.com/googleplay/answer/2651410?hl=en&amp;co=GENIE.CountryCode%3DIndonesia#zippy="};

    /* renamed from: c, reason: collision with root package name */
    public final String[] f3859c = {"Vous pouvez vous abonner aux services et payer un produit individuel via Google Play. Pour cela, l’utilisateur doit avoir une carte bancaire ou virtuelle, ou un autre moyen de paiement ajouté à son compte Google Play.", "Vous pouvez acheter des applications et du contenu numérique sur Google Play en utilisant les moyens de paiement associés à votre compte Google. Lors de votre premier achat, le moyen de paiement sera ajouté à votre compte Google. Vous pouvez ajouter les cartes de crédit/débit suivantes : American Express, Discover, JCB, MasterCard, Visa et Visa Electron.", "Pour ajouter un moyen de paiement à Google Play, utilisez cette instruction", "https://support.google.com/googleplay/answer/2651410?hl=en&amp;co=GENIE.CountryCode%3DIndonesia#zippy="};

    /* renamed from: d, reason: collision with root package name */
    public final String[] f3860d = {"Sie können Dienste abonnieren und einzelne Produkte über Google Play bezahlen. Dazu muss der Nutzer eine Bank- oder virtuelle Karte oder eine andere Zahlungsmethode zu seinem Google-Play-Konto hinzugefügt haben.", "Sie können Apps und digitale Inhalte bei Google Play mit den Zahlungsmethoden Ihres Google-Kontos kaufen. Wenn Sie zum ersten Mal einen Kauf tätigen, wird die Zahlungsmethode Ihrem Google-Konto hinzugefügt. Folgende Kredit- und Debitkarten werden unterstützt: American Express, Discover, JCB, MasterCard, Visa und Visa Electron.", "Um eine Zahlungsmethode zu Google Play hinzuzufügen, verwenden Sie diese Anleitung", "https://support.google.com/googleplay/answer/2651410?hl=en&amp;co=GENIE.CountryCode%3DIndonesia#zippy="};

    /* renamed from: e, reason: collision with root package name */
    public final String[] f3861e = {"Puede suscribirse a servicios y pagar productos individuales a través de Google Play. Para ello, el usuario debe tener una tarjeta bancaria o virtual, u otro método de pago añadido a su cuenta de Google Play.", "Puede comprar aplicaciones y contenido digital en Google Play utilizando los métodos de pago de su cuenta de Google. Si es la primera vez que realiza una compra, el método de pago se añadirá a su cuenta de Google. Puede añadir las siguientes tarjetas de crédito o débito: American Express, Discover, JCB, MasterCard, Visa y Visa Electron.", "Para añadir un método de pago a Google Play, utilice esta instrucción", "https://support.google.com/googleplay/answer/2651410?hl=en&amp;co=GENIE.CountryCode%3DIndonesia#zippy="};

    /* renamed from: f, reason: collision with root package name */
    public final String[] f3862f = {"Você pode assinar serviços e pagar por produtos individuais através do Google Play. Para isso, o usuário deve ter um cartão bancário ou virtual, ou outro método de pagamento adicionado à sua conta do Google Play.", "Você pode comprar aplicativos e conteúdo digital no Google Play usando os métodos de pagamento da sua conta Google. Se for a primeira compra, o método de pagamento será adicionado à sua conta Google. É possível adicionar os seguintes cartões de crédito/débito: American Express, Discover, JCB, MasterCard, Visa e Visa Electron.", "Para adicionar um método de pagamento ao Google Play, utilize esta instrução", "https://support.google.com/googleplay/answer/2651410?hl=en&amp;co=GENIE.CountryCode%3DIndonesia#zippy="};

    /* renamed from: g, reason: collision with root package name */
    public final String[] f3863g = {"Google Play üzerinden hizmetlere abone olabilir ve tekil ürünler için ödeme yapabilirsiniz. Bunun için kullanıcının Google Play hesabına bağlı bir banka veya sanal kart ya da başka bir ödeme yöntemi eklemiş olması gerekir.", "Google Play’de uygulama ve dijital içerikleri Google hesabınızdaki ödeme yöntemlerini kullanarak satın alabilirsiniz. İlk satın alma işleminizde ödeme yöntemi Google hesabınıza eklenir. Hesabınıza şu kredi/banka kartlarını ekleyebilirsiniz: American Express, Discover, JCB, MasterCard, Visa ve Visa Electron.", "Google Play’e bir ödeme yöntemi eklemek için bu talimatı kullanın", "https://support.google.com/googleplay/answer/2651410?hl=en&amp;co=GENIE.CountryCode%3DIndonesia#zippy="};

    public final String a(int i5) {
        int i10 = i5 - 1;
        String[] strArr = this.f3857a;
        return (i10 >= strArr.length || i10 < 0) ? "" : strArr[i10];
    }

    public final String b(int i5, String language) {
        Intrinsics.checkNotNullParameter(language, "language");
        int hashCode = language.hashCode();
        String[] strArr = this.f3858b;
        if (hashCode != 3201) {
            if (hashCode != 3246) {
                if (hashCode != 3276) {
                    if (hashCode != 3588) {
                        if (hashCode == 3651) {
                            language.equals("ru");
                        } else if (hashCode == 3710 && language.equals("tr")) {
                            strArr = this.f3863g;
                        }
                    } else if (language.equals("pt")) {
                        strArr = this.f3862f;
                    }
                } else if (language.equals("fr")) {
                    strArr = this.f3859c;
                }
            } else if (language.equals("es")) {
                strArr = this.f3861e;
            }
        } else if (language.equals("de")) {
            strArr = this.f3860d;
        }
        int i10 = i5 - 1;
        return (i10 >= strArr.length || i10 < 0) ? "" : strArr[i10];
    }
}
